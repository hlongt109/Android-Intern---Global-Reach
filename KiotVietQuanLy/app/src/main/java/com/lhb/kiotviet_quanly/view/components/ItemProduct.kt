package com.lhb.kiotviet_quanly.view.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColorInt
import coil.compose.AsyncImage
import com.lhb.kiotviet_quanly.R
import com.lhb.kiotviet_quanly.model.Product

@Composable
fun ItemProduct(
    product: Product
) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = Color("#ffffff".toColorInt()).copy(alpha = 0.8f),
            contentColor = Color("#ffffff".toColorInt())
        ),
        modifier = Modifier
            .fillMaxWidth()
            .height(130.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ) {
            AsyncImage(
                model = product.image,
                contentDescription = null,
                placeholder = painterResource(R.drawable.ic_launcher_foreground),
                error = painterResource(R.drawable.ic_launcher_foreground),
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(80.dp)
                    .padding(vertical = 3.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(Color.LightGray)
            )
            Spacer(modifier = Modifier.width(15.dp))
            Column {
                Text(
                    text = product.name,
                    color = Color(0xff303030),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium
                )
                Spacer(modifier = Modifier.height(5.dp))
                Row {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = product.id,
                            color = Color(0xff505050),
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Medium
                        )
                        Spacer(modifier = Modifier.width(10.dp))
                        Text(
                            text = "0",
                            color = Color(0xff505050),
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Medium,
                            modifier = Modifier
                                .clip(RoundedCornerShape(5.dp))
                                .background(Color(0xffFFA500).copy(alpha = 0.3f))
                                .padding(horizontal = 5.dp, vertical = 2.dp)
                        )
                    }
                    Spacer(modifier = Modifier.width(15.dp))

                    Text(
                        text = "KH đặt : 0",
                        color = Color(0xff505050),
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium,
                        modifier = Modifier
                            .clip(RoundedCornerShape(5.dp))
                            .background(Color(0xff808080).copy(alpha = 0.2f))
                            .padding(horizontal = 5.dp, vertical = 2.dp)
                    )
                }
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = product.price.toString(),
                    color = Color(0xff4169E1),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewItemProduct() {
    ItemProduct(product = Product("PR03", "Giày nam nữ Nice", 200000, ""))
}