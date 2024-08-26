package com.lhb.kiotviet_quanly.view.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import com.lhb.kiotviet_quanly.utils.formatCurrency

@Composable
fun ItemProduct2(
    product: Product,
    onClickItem: () -> Unit
){
    Card(
        colors = CardDefaults.cardColors(
            containerColor = Color("#ffffff".toColorInt()).copy(alpha = 0.8f),
            contentColor = Color("#ffffff".toColorInt())
        ),
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .clickable { onClickItem() }
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
            Column(
                modifier = Modifier.weight(1f).padding(top = 5.dp)
            ) {
                Text(
                    text = product.name,
                    color = Color(0xff303030),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = product.id,
                    color = Color(0xff606060),
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Medium
                )
            }
            Column(
                modifier = Modifier.weight(1f).padding(top = 5.dp),
                horizontalAlignment = Alignment.End
            ) {
                Text(
                    text = formatCurrency(product.price),
                    color = Color(0xff4169E1),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold
                )
                Text(
                    text = "Tồn: 0",
                    color = Color(0xff606060),
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Medium
                )
            }
        }
    }
}
