package com.example.myprofileapp

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.LocationOn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun App() {

    MaterialTheme {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            ProfileHeader()

            Spacer(modifier = Modifier.height(24.dp))

            ProfileCard {

                InfoItem(
                    icon = Icons.Rounded.Email,
                    label = "Email",
                    value = "refi.123140126@student.itera.ac.id"
                )

                InfoItem(
                    icon = Icons.Rounded.Phone,
                    label = "Phone",
                    value = "+62 85840438525"
                )

                InfoItem(
                    icon = Icons.Rounded.LocationOn,
                    label = "Location",
                    value = "Lampung Selatan"
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Button(onClick = { }) {
                Text("Contact Me")
            }
        }
    }
}