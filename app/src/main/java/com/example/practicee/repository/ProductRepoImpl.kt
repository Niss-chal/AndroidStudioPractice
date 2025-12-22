package com.example.practicee.repository

import android.util.Log
import com.example.practicee.model.ProductModel
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class ProductRepoImpl :  ProductRepo {

    var database : FirebaseDatabase = FirebaseDatabase.getInstance()

    var ref : DatabaseReference = database.getReference("products")

    override fun addProduct(
        model: ProductModel,
        callback: (Boolean, String) -> Unit
    ) {
        var id = ref.push().key.toString()
        model.productId = id

        ref.child(id).setValue(model).addOnCompleteListener {
            if(it.isSuccessful){
                callback(true,"Product Added Successfully")

            }
            else{
                callback(false,"${it.exception?.message}")
            }
        }
    }

    override fun updateProduct(
        model: ProductModel,
        callback: (Boolean, String) -> Unit
    ) {
        ref.child(model.productId).updateChildren(model.toMap()).addOnCompleteListener {
            if(it.isSuccessful){
                callback(true,"Product Added Successfully")

            }
            else{
                callback(false,"${it.exception?.message}")
            }
        }
    }

    override fun deleteProduct(
        productId: String,
        callback: (Boolean, String) -> Unit
    ) {
        ref.child(productId).removeValue().addOnCompleteListener {
            if(it.isSuccessful){
                callback(true,"Product Added Successfully")

            }
            else{
                callback(false,"${it.exception?.message}")
            }
        }
    }

    override fun getProductById(
        productId: String,
        callback: (Boolean, String, ProductModel?) -> Unit
    ) {
        ref.child(productId).addValueEventListener(object : ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                if(snapshot.exists()){
                    var data = snapshot.getValue(ProductModel :: class.java)
                    if  (data != null){
                        callback(true,"Product Fetched",data)
                    }
                }
            }

            override fun onCancelled(error: DatabaseError){
                callback(false,error.message,null)
            }

        })
    }

    override fun getAllProduct(callback: (Boolean, String, List<ProductModel>?) -> Unit) {
        ref.addValueEventListener(object : ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                if(snapshot.exists()){
                    var allProducts = mutableListOf<ProductModel>()
                    for(data in snapshot.children){
                        var product = data.getValue(ProductModel :: class.java)
                        if (product !=null){
                            allProducts.add(product)
                        }
                    }
                callback(true,"product fetched",allProducts)
                }
            }

            override fun onCancelled(error: DatabaseError) {
                callback(false,error.message,emptyList())
            }

        })
    }

    override fun getProductByCategory(
        categoryId: String,
        callback: (Boolean, String, List<ProductModel>?) -> Unit
    ) {
        ref.orderByChild("categoryId").equalTo(categoryId).addValueEventListener(object : ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                if(snapshot.exists()){
                    var allProducts = mutableListOf<ProductModel>()
                    for(data in snapshot.children){
                        var product = data.getValue(ProductModel :: class.java)
                        if (product !=null){
                            allProducts.add(product)
                        }
                    }
                }
            }

            override fun onCancelled(error: DatabaseError) {
                callback(false,error.message,emptyList())
            }

        })
    }

}