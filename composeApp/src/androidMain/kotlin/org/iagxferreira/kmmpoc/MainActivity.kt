package org.iagxferreira.kmmpoc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import org.iagxferreira.kmmpoc.articles.ArticlesViewModel
import org.iagxferreira.kmmpoc.screens.AboutScreen
import org.iagxferreira.kmmpoc.screens.ArticlesScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val articlesViewModel: ArticlesViewModel by viewModels()

        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ArticlesScreen(
                        articlesViewModel = articlesViewModel,
                        onAboutButtonClick = {}
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    MaterialTheme {
        AboutScreen()
    }
}