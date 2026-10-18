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
        "Ten Things I Hate About You",
        1999,
        97,
        "Romance",
        "Gil Junger",
        "Un chico es contratado para salir con la rebelde Kat y así poder conquistar a su hermana.",
        R.drawable.ten_things_hate_about_you
    ),
    Pelicula(
        2,
        "Titanic",
        1997,
        195,
        "Romance",
        "James Cameron",
        "Jack y Rose se enamoran a bordo del famoso barco que se dirige a un trágico destino.",
        R.drawable.titanic
    ),
    Pelicula(
        3,
        "The Notebook",
        2004,
        123,
        "Romance",
        "Nick Cassavetes",
        "Un anciano le lee a una mujer la historia de un amor de verano que desafió las diferencias sociales.",
        R.drawable.the_notebook
    ),
    Pelicula(
        4,
        "Pride & Prejudice",
        2005,
        129,
        "Romance",
        "Joe Wright",
        "Elizabeth Bennet y el orgulloso Mr. Darcy superan sus prejuicios para descubrir su amor.",
        R.drawable.pride_and_prejudice
    ),
    Pelicula(
        5,
        "La La Land",
        2016,
        128,
        "Musical",
        "Damien Chazelle",
        "Una actriz y un pianista de jazz persiguen sus sueños en Los Ángeles mientras se enamoran.",
        R.drawable.la_la_land
    ),
    Pelicula(
        6,
        "Pretty Woman",
        1990,
        119,
        "Romance",
        "Garry Marshall",
        "Un empresario contrata a una joven para que lo acompañe y termina enamorándose de ella.",
        R.drawable.pretty_woman
    ),
    Pelicula(
        7,
        "Dirty Dancing",
        1987,
        100,
        "Romance",
        "Emile Ardolino",
        "En unas vacaciones de verano, Baby aprende a bailar y se enamora del instructor Johnny.",
        R.drawable.dirty_dancing
    ),
    Pelicula(
        8,
        "A Walk to Remember",
        2002,
        101,
        "Romance",
        "Adam Shankman",
        "Un chico popular se enamora de una joven dulce y reservada que cambia su vida para siempre.",
        R.drawable.a_walk_to_remember
    ),
    Pelicula(
        9,
        "Notting Hill",
        1999,
        124,
        "Romance",
        "Roger Michell",
        "Un librero londinense común y corriente se enamora de una famosa estrella de cine.",
        R.drawable.notting_hill
    ),
    Pelicula(
        10,
        "The Fault in Our Stars",
        2014,
        126,
        "Drama romántico",
        "Josh Boone",
        "Dos adolescentes que se conocen en un grupo de apoyo viven una historia de amor intensa y emotiva.",
        R.drawable.the_fault_in_our_stars
    )
)

