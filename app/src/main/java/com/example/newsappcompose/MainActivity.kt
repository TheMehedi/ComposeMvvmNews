package com.example.newsappcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.newsappcompose.ui.navigation.AppNavigationGraph
import com.example.newsappcompose.ui.theme.NewsAppComposeTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NewsAppComposeTheme {

                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.White)
                ) {

                    AppEntryPoint()
                }
            }
        }
    }
}

@Composable
private fun AppEntryPoint() {
    AppNavigationGraph()
}