package com.roshan.documentmanager.ui.screen.backup

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun BackupScreen(

    loading: Boolean,

    onBackupClick: () -> Unit,

    onRestoreClick: () -> Unit

) {

    Column(

        modifier = Modifier

            .fillMaxSize()

            .padding(16.dp)

    ) {

        Text(

            text = "Backup & Restore",

            style = MaterialTheme.typography.headlineMedium

        )

        Spacer(

            modifier = Modifier.height(24.dp)

        )

        Button(

            modifier = Modifier.fillMaxWidth(),

            enabled = !loading,

            onClick = onBackupClick

        ) {

            Text(

                "Create Backup"

            )

        }

        Spacer(

            modifier = Modifier.height(12.dp)

        )

        Button(

            modifier = Modifier.fillMaxWidth(),

            enabled = !loading,

            onClick = onRestoreClick

        ) {

            Text(

                "Restore Backup"

            )

        }

        if (

            loading

        ) {

            Spacer(

                modifier = Modifier.height(24.dp)

            )

            CircularProgressIndicator()

        }

    }

}
