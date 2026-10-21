package elena.fierros.cartelera

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import elena.fierros.cartelera.ui.theme.CarteleraTheme
import com.google.firebase.auth.FirebaseAuth

@Composable
fun LoginScreen(
    onLoginOk:()-> Unit,
    onRegistrarse: () -> Unit
){
    var correo by rememberSaveable { mutableStateOf("") }
    var contrasenia by rememberSaveable { mutableStateOf("") }
    var hayError by rememberSaveable { mutableStateOf(false) }
    Column(
        modifier = Modifier.fillMaxSize().padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(
            space = 12.dp,
            alignment = Alignment.CenterVertically
        ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Cartelera",
            style = MaterialTheme.typography.headlineLarge
        )
        OutlinedTextField(
            value = correo,
            onValueChange = {correo = it},
            label = { Text("Correo electrónico") },
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email
            ),
            modifier = Modifier.fillMaxWidth(),
            isError = hayError
        )
        OutlinedTextField(
            value = contrasenia,
            onValueChange = {contrasenia = it},
            label = {Text("Contraseña")},
            singleLine = true,
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password
            ),
            modifier = Modifier.fillMaxWidth(),
            isError = hayError
        )
        if (hayError){
            Text(
                text = "Correo o contraseña incorrectos",
                color = MaterialTheme.colorScheme.error
            )
        }
        Button(
            onClick = {
                if (correo.isBlank() || contrasenia.isBlank()) {
                    hayError = true
                } else {
                    FirebaseAuth.getInstance()
                        .signInWithEmailAndPassword(correo, contrasenia)
                        .addOnCompleteListener { task ->
                            if (task.isSuccessful) {
                                onLoginOk()
                            } else {
                                hayError = true
                            }
                        }
            }},
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Ingresar")
        }
        TextButton(onClick = onRegistrarse) {
            Text("¿No tienes cuenta? Registrate")
        }

    }
}

@Preview
@Composable
fun LoginScreenPreview(){
    CarteleraTheme() {
        LoginScreen(onLoginOk =  {}, onRegistrarse = {})
    }
}