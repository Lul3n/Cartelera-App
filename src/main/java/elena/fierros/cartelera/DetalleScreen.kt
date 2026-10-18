package elena.fierros.cartelera

import android.R
import android.telecom.Call
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import elena.fierros.cartelera.ui.theme.CarteleraTheme

@Composable
fun DetalleScreen(peliculaId: Int, onBack: () -> Unit){
    val pelicula = peliculas.first{it.id == peliculaId}
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ){
            Image(
                painter = painterResource(pelicula.imagen),
                contentDescription = "Póster de ${pelicula.titulo}",
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(320.dp)
            )
            Text(
                text = pelicula.titulo,
                style = MaterialTheme.typography.headlineMedium
            )
            Text(text = "${pelicula.anio} - ${pelicula.duracion} min - ${pelicula.genero}")
            Text(text = "Director: ${pelicula.director}")
            Text(
                text = "Sinopsis",
                style = MaterialTheme.typography.titleMedium
            )
            Text(text = pelicula.sinopsis)
            OutlinedButton(
                onClick = onBack,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Regresar")
            }
        }
}


@Preview(showBackground = true)
@Composable
fun DetalleScreenPreview(){
    CarteleraTheme {
        DetalleScreen(peliculaId = 1, onBack = {})
    }
}