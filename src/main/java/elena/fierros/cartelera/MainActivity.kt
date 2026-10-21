package elena.fierros.cartelera

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import elena.fierros.cartelera.ui.theme.CarteleraTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Ciclo", "onCreate")
        enableEdgeToEdge()
        setContent {
            CarteleraTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    AppNavigation(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }

    override fun onStart() { super.onStart(); Log.d("Ciclo","onStart")}
    override fun onResume() { super.onResume(); Log.d("Ciclo", "onResume")}
    override fun onPause() {super.onPause(); Log.d("Ciclo", "onPause")}
    override fun onStop() {super.onStop(); Log.d("Ciclo","onStop")}
    override fun onDestroy() { super.onDestroy(); Log.d("Ciclo", "onDestroy")}
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CarteleraTheme {
        Greeting("Android")
    }
}