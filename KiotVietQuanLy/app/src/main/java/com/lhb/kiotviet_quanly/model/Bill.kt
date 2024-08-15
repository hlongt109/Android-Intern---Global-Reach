package com.lhb.kiotviet_quanly.model

data class Bill(
    val id: String,
    val customerName: String,
    val date: String,
    val productId: String,
    val productName: String,
    val quantity: Int,
    val totalAmount: Int,
    val paymentMrthod: String
)
