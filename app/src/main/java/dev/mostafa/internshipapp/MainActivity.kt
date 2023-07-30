package dev.mostafa.internshipapp

import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.text.style.BackgroundColorSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.rounded.Face
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.mostafa.internshipapp.ui.theme.InternshipAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InternshipAppTheme {
                // A surface container using the 'background' color from the theme
                Surface (modifier = Modifier.background(Color.Red)
                )
                {



                    greeting()

                Column() {


                    Button(onClick = { /*TODO*/ },) {


                        androidx.compose.material3.Icon(
                            painter = painterResource(id = R.drawable.ic_fac),
                            contentDescription = ""
                        )
                        Spacer(modifier = Modifier.width(10.dp))
                        Text(
                            text = "button",
                            style = androidx.compose.ui.text.TextStyle(
                                color = Color.Black,

                                fontSize = 20.sp
                            )
                        )


                    }
                    Button(onClick = { /*TODO*/ },) {

                        Text(
                            text = "button",
                            style = androidx.compose.ui.text.TextStyle(
                                fontSize = 20.sp
                            )


                        )
                        Spacer(modifier = Modifier.width(15.dp))

                        Text(
                            text = "button",
                            style = androidx.compose.ui.text.TextStyle(
                                color = Color.Magenta,

                                fontSize = 20.sp
                            )
                        )


                    }


                }
            }
            }
        }
    }


}



@Composable
@Preview(showBackground = true)
fun Mytext(){
    Text(
            text = "hello",
        style = androidx.compose.ui.text.TextStyle(
            fontSize = 20.sp
        )
    )

}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun greeting(){
   Column (
       modifier = Modifier.fillMaxSize(),
       horizontalAlignment = Alignment.CenterHorizontally,
       verticalArrangement = Arrangement.Center,
           )
    {

var email by remember { mutableStateOf("")}
        TextField(value = email, onValueChange ={email=it},
            label = {
                Text(text = "Email",
                    style = TextStyle(
                        color = Color.Cyan
                    )
                )
            },
            leadingIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Filled.Email, contentDescription = "")
                }
            },
            maxLines = 1,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email
            ),
            modifier = Modifier.background(Color.Red)




        )




        var pass by remember { mutableStateOf("")}
        OutlinedTextField(value = pass, onValueChange ={pass=it},
          label = {
              Text(text ="Password",
                  style = TextStyle(color=Color.Cyan)
              )
          },          leadingIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Rounded.Face, contentDescription = "",)
                }
            },
            maxLines = 1,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password
            ),
            modifier = Modifier.background(Color.LightGray)




        )

   }
}