package com.lhb.kiotviet_quanly.model

data class RetailCustomer(
    val id: String,
    val name: String,
    val phone: String,
    val image: String
)

object RetailCustomerRepository{
    val allCustomer = listOf(
        RetailCustomer("1", "John Doe", "0987654321", ""),
        RetailCustomer("2", "Jane Doe", "0123456789", "")
    )
}
