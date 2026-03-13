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
import androidx.compose.runtime.*

@Composable
fun App() {
    MaterialTheme {
        var showDialog by remember { mutableStateOf(false) }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ProfileHeader()

            Spacer(modifier = Modifier.height(20.dp))

            // Bio / summary — gantiin card kontak yang lama
            BioSection()

            Spacer(modifier = Modifier.height(20.dp))

            Button(onClick = { showDialog = true }) {
                Text("Contact Me")
            }
        }

        // Dialog popup — sekarang isinya kontak aja
        if (showDialog) {
            AlertDialog(
                onDismissRequest = { showDialog = false },
                title = { Text("Contact Info") },
                text = {
                    Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
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
                },
                confirmButton = {
                    TextButton(onClick = { showDialog = false }) {
                        Text("Tutup")
                    }
                }
            )
        }
    }
}