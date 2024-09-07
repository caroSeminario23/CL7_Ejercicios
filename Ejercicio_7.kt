enum class ParteDia {
    MAÑANA,
    TARDE,
    NOCHE
}

data class Event(
    var titulo: String,
    var descripcion: String? = null,
    var parteDia: ParteDia,
    var duracionMinutos: Int
) {}

val Event.duracionEvento: String 
    get() = if (this.duracionMinutos < 60) {
         "corta"
    } else {
        "larga"
    }

fun main() {
    val event1 = Event(titulo = "Wake up", descripcion = "Time to get up", parteDia = ParteDia.MAÑANA, duracionMinutos = 0)
    val event2 = Event(titulo = "Eat breakfast", parteDia = ParteDia.MAÑANA, duracionMinutos = 15)
    val event3 = Event(titulo = "Learn about Kotlin", parteDia = ParteDia.TARDE, duracionMinutos = 30)
    val event4 = Event(titulo = "Practice Compose", parteDia = ParteDia.TARDE, duracionMinutos = 60)
    val event5 = Event(titulo = "Watch latest DevBytes video", parteDia = ParteDia.TARDE, duracionMinutos = 10)
    val event6 = Event(titulo = "Check out latest Android Jetpack library", parteDia = ParteDia.NOCHE, duracionMinutos = 45)
    
    val eventos = mutableListOf<Event>(event1, event2, event3, event4, event5, event6) 

    println("Duración del primero evento del día: ${eventos.first().duracionEvento}")
    println("Duración del segundo evento del día: ${eventos.get(1).duracionEvento}")
}