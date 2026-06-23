package com.roshan.documentmanager.ui.screen.settings

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Palette
import androidx.compose.material.icons.outlined.PrivacyTip
import androidx.compose.material.icons.outlined.Storage
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SettingsScreen(

    onBackupClick: () -> Unit,

    onPrivacyClick: () -> Unit,

    onAboutClick: () -> Unit

) {

    LazyColumn(

        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)

    ) {

        item {

            Text(

                text = "Settings",

                style = MaterialTheme.typography.headlineMedium

            )

        }

        item {

            Spacer(

                modifier = Modifier.height(16.dp)

            )

        }

        item {

            ListItem(

                headlineContent = {

                    Text("Backup & Restore")

                },

                supportingContent = {

                    Text("Export or Restore Documents")

                },

                leadingContent = {

                    Icon(

                        Icons.Outlined.Storage,

                        null

                    )

                },

                modifier = Modifier.fillMaxWidth()

            )

        }

        item {

            Divider()

        }

        item {

            ListItem(

                headlineContent = {

                    Text("Theme")

                },

                supportingContent = {

                    Text("Material You")

                },

                leadingContent = {

                    Icon(

                        Icons.Outlined.Palette,

                        null

                    )

                }

            )

        }

        item {

            Divider()

        }

        item {

            ListItem(

                headlineContent = {

                    Text("Privacy Policy")

                },

                leadingContent = {

                    Icon(

                        Icons.Outlined.PrivacyTip,

                        null

                    )

                },

                modifier = Modifier.fillMaxWidth()

            )

        }

        item {

            Divider()

        }

        item {

            ListItem(

                headlineContent = {

                    Text("About")

                },

                supportingContent = {

                    Text("Document Manager v1.0")

                },

                leadingContent = {

                    Icon(

                        Icons.Outlined.Info,

                        null

                    )

                }

            )

        }

    }

}
