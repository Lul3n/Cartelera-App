package elena.fierros.cartelera

data class Pelicula(
    val id: Int,
    val titulo: String,
    val anio: Int,
    val duracion: Int,
    val genero: String,
    val director: String,
    val sinopsis: String,
    val imagen: Int
)

val peliculas = listOf(
    Pelicula(
        1,
        "arcane",
        2010,
        120,
        "Accion",
        "Yo",
        "Esta cool chicos",
        R.drawable.arcane
    ),
    Pelicula(
      2,
        "Ten things I hate about you",
        2000,
        120,
        "Romance",
        "yo otra vez",
        "Muy linda",
        R.drawable.ten_things_hate_about_you
    )
)
