
package com.example.plantilla_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.examendi.R



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        }
    }
}


//@Preview(showBackground = true, widthDp = 400, heightDp = 800)
@Composable
private fun ExamenDI(isLandscape: Boolean) {

    val backColor = (R.color.teal_200)

    val nombreApp = stringResource(R.string.app_name)
    var texto by rememberSaveable { mutableStateOf(nombreApp) }

    val textBtn1 = "Btn1"
    val textBtn2 = "Btn2"
    val textBtn3 = "Btn3"
    val textBtn4 = "Btn4"
    val textBtn5 = "Btn5"
    val textBtn6 = "Btn6"

    Column(
        modifier = with(Modifier) { fillMaxSize().padding().background(color = R.color.teal_200) }

    ) {
        Text(
            text = texto,
            color = Color.White,
            fontSize = 25.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .padding(0.dp, 20.dp)
        )
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(
                onClick = {
                    texto = textBtn1
                },
                // Cambiar colores del botón
                colors = ButtonDefaults.buttonColors(Color.Gray, Color.Blue),
                modifier = Modifier.width(200.dp),
                // Cambiar forma del botón
                shape = RoundedCornerShape(30.dp)
            ) {
                Text(textBtn1)
            }
            Button(
                onClick = {
                    texto = textBtn2
                },
                colors = ButtonDefaults.buttonColors(Color.Blue, Color.White)
            ) {
                Text(textBtn2)
            }

        }
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Row {
                Column(
                    modifier = Modifier
                        .weight(1f),
                    verticalArrangement = Arrangement.Center
                )
            } 

            Spacer(modifier = Modifier.width(50.dp))
            Column(
                modifier = Modifier
                    .weight(0.5f)
                    .height(100.dp),
                verticalArrangement = Arrangement.Center
            ) 
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            val lista = listOf("1", "2", "3")
            val color = colorResource(R.color.teal_200)
          
            }
        }
    }
//@Preview(showBackground = true, showSystemUi = true)
fun Column(modifier: Modifier, verticalArrangement: Arrangement.HorizontalOrVertical) {

}














