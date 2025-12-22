package com.example.practicee.model

data class ProductModel(
    var productId: String="",
    var name: String="",
    var price: String= "",
//    var productImage: Int= 0,
    var description: String="",
    var categoryId: String ="",
)
{
    fun toMap() : Map<String, Any?>{
        return mapOf(
            "name" to name,
            "price" to price,
            "description" to description,
        )
    }
}
