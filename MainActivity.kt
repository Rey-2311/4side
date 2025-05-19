package com.example.firstattempt

import android.os.Bundle
import androidx.compose.material3.*
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.firstattempt.ui.theme.FirstAttemptTheme
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.border
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FirstAttemptTheme {
                CalculatorUI()
            }
        }
    }
}

@Composable
fun CalcButton(label: String, onClick: () -> Unit, xOffset: Dp, yOffset: Dp) {
    OutlinedButton(
        onClick = onClick,
        modifier = Modifier
            .offset(xOffset, yOffset)
            .width(80.dp)
            .height(55.dp),
        shape = RoundedCornerShape(8.dp)
    ) {
        Text(label, fontSize = 24.sp)
    }
}

@Composable
fun CalculatorUI() {
    var a by remember { mutableStateOf("") }
    var b by remember { mutableStateOf(0) }
    var result by remember { mutableStateOf(0) }
    var operation by remember { mutableStateOf("") }
    var history by remember { mutableStateOf(listOf<String>()) }

    BoxWithConstraints(modifier = Modifier.fillMaxSize()) {
        val w = maxWidth
        val h = maxHeight

        // Display current input
        Box(
            modifier = Modifier
                .offset(x = w * 0.1f, y = h * 0.05f)
                .width(w * 0.8f)
                .height(60.dp)
                .border(2.dp, Color.Gray, shape = RoundedCornerShape(8.dp))
                .padding(12.dp)
        ) {
            Text("Input: $a")
        }

        Box(
            modifier = Modifier
                .offset(x = w * 0.1f, y = h * 0.15f)
                .width(w * 0.8f)
                .height(60.dp)
                .border(2.dp, Color.Gray, shape = RoundedCornerShape(8.dp))
                .padding(12.dp)
        ) {
            Text("Result: $result")
        }
        Box(
            modifier = Modifier
                .offset(x = w * 0.1f, y = h * 0.25f)
                .width(w * 0.8f)
                .height(250.dp)
                .border(2.dp, Color.Gray, shape = RoundedCornerShape(8.dp))
                .padding(12.dp)
        ) {
            Column {
                Text("History:", fontSize = 18.sp)
                history.takeLast(5).reversed().forEach { line ->
                    Text(line, fontSize = 14.sp)
                }
            }

        }

        CalcButton("1", { a += "1" }, w * 0.05f, h * 0.6f)
        CalcButton("2", { a += "2" }, w * 0.30f, h * 0.6f)
        CalcButton("3", { a += "3" }, w * 0.55f, h * 0.6f)

        CalcButton("4", { a += "4" }, w * 0.05f, h * 0.7f)
        CalcButton("5", { a += "5" }, w * 0.30f, h * 0.7f)
        CalcButton("6", { a += "6" }, w * 0.55f, h * 0.7f)

        CalcButton("7", { a += "7" }, w * 0.05f, h * 0.8f)
        CalcButton("8", { a += "8" }, w * 0.30f, h * 0.8f)
        CalcButton("9", { a += "9" }, w * 0.55f, h * 0.8f)

        CalcButton("0", { a += "0" }, w * 0.30f, h * 0.9f)

        CalcButton("+", {
            b = a.toIntOrNull() ?: 0
            a = ""
            operation = "+"
        }, w * 0.80f, h * 0.6f)

        CalcButton("-", {
            b = a.toIntOrNull() ?: 0
            a = ""
            operation = "-"
        }, w * 0.8f, h * 0.7f)

        CalcButton("x", {
            b = a.toIntOrNull() ?: 0
            a = ""
            operation = "x"
        }, w * 0.8f, h * 0.8f)

        CalcButton("/", {
            b = a.toIntOrNull() ?: 0
            a = ""
            operation = "/"
        }, w * 0.8f, h * 0.9f)

        CalcButton("=", {
            val c = a.toIntOrNull() ?: 0
            if (operation != "") {
                result = when (operation) {
                    "+" -> b + c
                    "-" -> b - c
                    "x" -> b * c
                    "/" -> if (c != 0) b / c else 0
                    else -> 0
                }
                history = history + "$b $operation $c = $result"
            }
            a = ""
            b = result
        }, w * 0.55f, h * 0.9f)

        CalcButton("C", {
            a = ""
            b = 0
            result = 0
            operation = ""
        }, w * 0.05f, h * 0.9f)

        Button(modifier = Modifier.offset(w * 0.65f, h * 0.45f), onClick = {history = listOf()}) { Text("Clear") }

    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FirstAttemptTheme {

    }
}