fun main() {

    var listaEvento = mutableListOf(
        Evento("Prueba ejercicio 2", "llamado a una class", dmDia.Mañana.toString(), 62),
        Evento("Prueba ejercicio 13", "llamado a una class", dmDia.Noche.toString(), 18),
        Evento("Prueba ejercicio 14", "llamado a una class", dmDia.Noche.toString(), 12),
        Evento("Prueba ejercicio 15", "llamado a una class", dmDia.MedioDia.toString(), 10)
    )

    var EventosCortosGrupo = listaEvento.groupBy { it.dia }
    EventosCortosGrupo.forEach{
        (dia, Evento) -> println("$dia: ${Evento.size} eventos")
    }

    println("Ultimo Evento del dia: ${listaEvento.last().titulo}")

}

data class Evento(var titulo: String, var descripcion: String?, var dia: String, var duracion: Int) {

    val Evento.durationOfEvent: String
        get() = if (this.duracion < 60) {
            "short"
        } else {
            "long"
        }
}

enum class dmDia {
    Mañana, MedioDia, Noche
}
