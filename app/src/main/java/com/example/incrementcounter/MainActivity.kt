package com.example.incrementcounter

import android.R
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.incrementcounter.ui.theme.IncrementCounterTheme
import kotlinx.coroutines.delay

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("MainActivity", "onCreate: MainActivity")
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show()
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContent {
            IncrementCounterTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                   Counter()
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity", "onStart: MainActivity")
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show()
    }
    override fun onResume() {
        super.onResume()
        Log.d("MainActivity", "onResume: MainActivity")
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show()
    }
    override fun onPause() {
        super.onPause()
        Log.d("MainActivity", "onPause: MainActivity")
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show()
    }
    override fun onRestart() {
        super.onRestart()
        Log.d("MainActivity", "onRestart: MainActivity")
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show()
    }


    override fun onBackPressed() {
        super.onBackPressed()
        Log.d("MainActivity", "onBackPressed: MainActivity")
        Toast.makeText(this, "onBackPressed", Toast.LENGTH_SHORT).show()


    }
    override fun onStop() {
        super.onStop()
        Log.d("MainActivity", "onStop: MainActivity")
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show()


    }







}

@Composable
fun Counter(){
    var Count= remember{mutableStateOf(0)}
    var isRunning=false
    Button(
        onClick = {
            Count.value++
            isRunning != isRunning
                  },
        modifier = Modifier.padding(top=450.dp,start=150.dp),
        colors = ButtonDefaults.buttonColors(containerColor=Color.LightGray)

    ){
        Text(text = "Count: ${Count.value}")

    }
}