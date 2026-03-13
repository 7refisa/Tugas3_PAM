package com.example.myprofileapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import myprofileapp.composeapp.generated.resources.Res
import myprofileapp.composeapp.generated.resources.profile_refi

@Composable
fun ProfileHeader() {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(resource =Res.drawable.profile_refi),
            contentDescription = "Profile Photo",
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
                .border(2.dp, MaterialTheme.colorScheme.primary, CircleShape),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = "Refi Ikhsanti",
            fontSize = 20.sp
        )

        Text(
            text = "Informatics Student",
            fontSize = 14.sp
        )
    }
}

@Composable
fun ProfileCard(content: @Composable ColumnScope.() -> Unit) {

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp)
    ) {

        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
            content = content
        )
    }
}

@Composable
fun InfoItem(
    icon: ImageVector,
    label: String,
    value: String
) {

    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {

        Icon(
            imageVector = icon,
            contentDescription = label
        )

        Spacer(modifier = Modifier.width(12.dp))

        Column {

            Text(
                text = label,
                fontSize = 12.sp
            )

            Text(
                text = value,
                fontSize = 14.sp
            )
        }
    }
}