import Quiz.ProgresoEstudiante.barraProgreso
import Quiz.ProgresoEstudiante.progresoTexto

fun main() {
    Quiz.barraProgreso()
}

data class Pregunta<T>(
    var pregunta: String,
    var respuesta: T,
    var dificultad: dmDificultad
) {
}

enum class dmDificultad{
    FACIL, MEDIO, DURO
}

class Quiz{
    var pregunta = Pregunta<Int>("ds",12,dmDificultad.FACIL)
    var pregunta2 = Pregunta<Boolean>("ds",true,dmDificultad.MEDIO)
    var pregunta3 = Pregunta<String>("ds","Hello World!",dmDificultad.DURO)

   companion object ProgresoEstudiante {
        var total: Int = 10
        var respondida: Int = 3

       val Quiz.ProgresoEstudiante.progresoTexto: String
           get() = "${Quiz.total} de  ${Quiz.respondida}"


       fun Quiz.ProgresoEstudiante.barraProgreso(){
           repeat(Quiz.respondida) { print("▓") }
           repeat(Quiz.total -Quiz.respondida){print("▒")}
           println()
           println(Quiz.progresoTexto)
       }

    }

}



