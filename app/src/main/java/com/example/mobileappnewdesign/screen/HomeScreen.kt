package com.example.mobileappnewdesign.screen

import android.content.Context
import android.media.Image
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.gestures.detectTransformGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.PaintingStyle
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mobileappnewdesign.R
import com.example.mobileappnewdesign.ui.theme.BlueMain
import com.example.mobileappnewdesign.ui.theme.BlueSecond
import com.example.mobileappnewdesign.ui.theme.White
import kotlinx.coroutines.delay

@Composable
fun HomeScreen(
    context: Context
){
    val verticalGradientBrush = Brush.verticalGradient(
        colors = listOf(
            BlueSecond.copy(alpha = 0.1f), // End color (20% transparent BlueSecond)
            BlueSecond.copy(alpha = 0.5f), // Start color (BlueSecond)
            BlueSecond.copy(alpha = 0.7f), // Start color (BlueSecond)
            BlueSecond.copy(alpha = 0.9f), // Start color (BlueSecond)
            BlueSecond.copy(alpha = 1f), // Start color (BlueSecond)
            BlueSecond.copy(alpha = 1f), // Start color (BlueSecond)
            BlueSecond.copy(alpha = 1f), // Start color (BlueSecond)
            BlueSecond.copy(alpha = 1f), // Start color (BlueSecond)
            BlueSecond.copy(alpha = 1f), // Start color (BlueSecond)
            BlueSecond.copy(alpha = 1f), // Start color (BlueSecond)
            BlueSecond, // Start color (BlueSecond)

        )
    )

    var index by remember { mutableStateOf(0) }

    val listImage = listOf<Int>(
        R.drawable.image_home_1,
        R.drawable.image_home_2,
        R.drawable.image_home_3
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(BlueMain)
            .clickable {
                index +=1
            }


    ){

        Image(
            painter = painterResource(
                if (index == 0) listImage[0] else if(index == 1) listImage[1] else listImage[2]
            ),
            contentDescription = "Image 1",
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.FillHeight
        )
        Image(
            painter = painterResource(
                R.drawable.logo_app
            ),
            contentDescription = "Logo App",
            modifier = Modifier
                .align(Alignment.TopCenter)
                // You can also add additional padding or offsets if needed
                .padding(top = 16.dp)
        )
        Box(
            modifier = Modifier
                .fillMaxHeight(0.37f)
                .align(Alignment.BottomCenter)
                .background(verticalGradientBrush)
        ){
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                TextHome(
                    true,
                    "Donasi Cepat & Tepat Sasaran"
                )
                TextHome(
                    false,
                    "Merupakan komitmen untuk berpartisipasi dalam bidang sosial dan kemanusiaan sebagai wujud tanggungjawab sosial perusahaan"
                )
                ButtonHome(
                    "Mulai Donasi!",
                    Modifier
                        .padding(
                            vertical = 30.dp,
                            horizontal = 90.dp
                        )
                )
            }
        }
    }
}

@Composable
fun TextHome(
    isBold: Boolean,
    s: String
) {
    Text(
        s,
        fontSize = if (isBold) 18.sp else 14.sp,
        fontWeight = if (isBold) FontWeight.Bold else FontWeight.Normal,
        color = Color.White,
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                start = 30.dp, end = 30.dp,
                bottom = 20.dp
            ),
        textAlign = TextAlign.Center
    )
}

@Composable
fun ButtonHome(
    s: String,
    modifier: Modifier = Modifier
){
    Button(
        onClick = {},
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent,
        ),
        border = BorderStroke(1.dp, White),
        modifier = modifier
    ){
        Text(
            s,
            fontSize = 18.sp,
            color = White,
            modifier = Modifier
                .padding(
                    5.dp
                )
        )
    }
}

@Preview
@Composable
fun PreviewHalfCircle() {
    val context = LocalContext.current
    HomeScreen(context)
}

