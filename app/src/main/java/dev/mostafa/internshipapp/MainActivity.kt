package dev.mostafa.internshipapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
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






                Column (
                   horizontalAlignment =Alignment.CenterHorizontally
                ){
Box(
    Modifier.padding(14.dp)
){
                  Text(text = "Facebook",
                      style = TextStyle(
                          color = Color.Blue,
                          fontSize = 40.sp,
                          fontWeight = FontWeight.Bold
                      )
                  )

}
                    greeting()

















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
       verticalArrangement = Arrangement.Center,
       horizontalAlignment = Alignment.CenterHorizontally
           )
   {

       var email by remember { mutableStateOf("") }
       OutlinedTextField(
           value = email, onValueChange = { email = it },
           label = {
               Text(
                   text = "Email",

                   )
           },
           leadingIcon = {
               IconButton(onClick = { /*TODO*/ }) {
                   Icon(imageVector = Icons.Filled.Email, "")
               }
           },
           maxLines = 1,
           keyboardOptions = KeyboardOptions(
               keyboardType = KeyboardType.Email
           ),


           )
       Spacer(Modifier.height(10.dp))


       var passwordVisibilty by remember {
           mutableStateOf(false)
       }

           val icon = if (passwordVisibilty)
               painterResource(id = R.drawable.ic_visibility_on)
            else {
               painterResource(id = R.drawable.ic_visibility_off)
           }
           var pass by remember { mutableStateOf("") }
           OutlinedTextField(
               value = pass, onValueChange = { pass = it },
              placeholder = {
                      Text(text =
                      "password"
                      )
              },

               trailingIcon = {
                   IconButton(onClick = { passwordVisibilty = !passwordVisibilty }) {
                       androidx.compose.material3.Icon(
                           painter = icon as Painter,
                           contentDescription = ""
                       )
                   }
               },
               maxLines = 1,
               keyboardOptions = KeyboardOptions(
                   keyboardType = KeyboardType.Password
               ),
               visualTransformation = if (passwordVisibilty)
                   VisualTransformation.None
               else
                   PasswordVisualTransformation(),

               )
       Spacer(modifier = Modifier.height(7.dp))

Row {
    Button(onClick = { /*TODO*/ }) {
        Text(text = "login")
    }
    TextButton(onClick = { }) {

        Text(text = "Sign up",
            style = TextStyle(
                color = Color.Red,
            )
        )
    }
}



       }

   }