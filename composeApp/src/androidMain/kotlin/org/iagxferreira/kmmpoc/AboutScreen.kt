package org.iagxferreira.kmmpoc

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun AboutScreen() {
    Column {
        Toolbar()
        ContentView()
    }
}


@OptIn(ExperimentalMaterialApi::class)
@Composable
private fun Toolbar() {
    TopAppBar(
        title = { Text(text = "About Device") }
    )
}

@Composable
private fun ContentView() {
    val items = makeItems()

    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(items) { row ->
            RowView(title = row.first, subtitle = row.second)
        }
    }
}

private fun makeItems(): List<Pair<String, String>> {
    val platform = Platform()
    platform.logSystemInfo()

    return listOf(
        Pair("Operating System", "${platform.osName} ${platform.osVersion}"),
        Pair("Device", platform.deviceModel),
        Pair("Density", platform.density.toString()),
    )
}

@Composable
private fun RowView(
    title: String,
    subtitle: String,
) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Column(modifier = Modifier.padding(8.dp)) {
            Text(
                text = title,
                style = MaterialTheme.typography.h6,
                color = Color.Gray
            )
            Text(
                text = subtitle,
                style = MaterialTheme.typography.body2,
            )
        }
    }
}

@Preview
@Composable
fun DefaultPreview() {
    AboutScreen()
}