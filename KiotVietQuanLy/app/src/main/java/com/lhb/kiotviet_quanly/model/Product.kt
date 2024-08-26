package com.lhb.kiotviet_quanly.model

data class Product(
    val id: String,
    val name: String,
    val price: Int,
    val image: String,
    val exist: Int

)

object ProductRepository {
    val allProducts = listOf(
        Product("PR01", "Cà vạt nam Hàn Quốc", 200000, "", 1),
        Product("PR02", "Giày nam Air F1", 200000, "", 1),
        Product("PR03", "Giày nam nữ Nice", 200000, "", 2),
        Product("PR04", "Áo polo nam", 200000, "", 2),
        Product("PR05", "Giày cao gót nữ", 200000, "", 2),
        Product("PR06", "Quần nam Heven", 200000, "", 2),
        Product("PR07", "Áo somi nữ", 200000, "", 2),
        Product("PR08", "Cà vạt nữ Hàn Quốc", 200000, "", 2),
        Product("PR09", "Áo đại bàng", 200000, "", 2),
        Product("PR010", "Áo sói", 200000, "", 2)
    )
}
