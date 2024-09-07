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

fun main() {
    val evento = Event(
        "Estudiar Kotlin", 
        "Comprometerse a estudiar Kotlin al menos 15 minutos al día.", 
        ParteDia.NOCHE, 
        15)
    println("Evento:")
    println("------")
    println(evento.toString())
}