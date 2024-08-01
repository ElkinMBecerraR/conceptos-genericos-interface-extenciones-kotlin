import java.math.BigDecimal

fun main() {
    val menuCompleto = galleta.map { "${it.nombre} - $${it.precio}" }
    menuCompleto.forEach { println(it) }

    val galletaConRelleno = galleta.filter { it.relleno != true }
    galletaConRelleno.forEach { println( "Galletas sin relleno ${it.nombre}") }

    val menuAgrupado = galleta.groupBy { it.relleno }

    val listRelleno = menuAgrupado[true] ?: emptyList()
    val listaSinRelleno = menuAgrupado[false] ?: emptyList()

    println("Lista con el groupBy")
    listRelleno.forEach { println(it.nombre) }
    println("Lista con el groupBy sin relleno")
    listaSinRelleno.forEach { println(it.nombre) }

    var precioTotal = galleta.fold(0.0) { total, galleta -> total + galleta.precio }
    println("Precio Total: $${precioTotal}")

    var listaOrdenada = galleta.sortedBy { it.precio }

    listaOrdenada.forEach { println(it.precio) }

}

class Galleta(
    var nombre: String,
    var precio: Int,
    var alHorno: Boolean,
    var relleno: Boolean
) {

}

var galleta = listOf(
    Galleta("Pan Or", 1200, false, true),
    Galleta("Olla Or", 3200, true, false),
    Galleta("Dir Sor", 6500, false, true),
    Galleta("Pan Or", 6588, false, true),
    Galleta("Pan Or", 3000, false, true),
    Galleta("Churro Or", 2000, true, true),
)