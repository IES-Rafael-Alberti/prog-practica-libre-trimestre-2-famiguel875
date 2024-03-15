/**
 * Clase que representa la tienda del juego.
 */
class Tienda {
    val objetos = mutableMapOf(
        "Poción" to 5,
        "Elixir" to 7,
        "Provisiones" to 10
    )

    /**
     * Método para comprar un artículo de la tienda.
     * @param nombreObjeto Nombre del artículo a comprar.
     * @return true si la compra es exitosa, false de lo contrario.
     */
    fun comprar(nombreObjeto: String): Boolean {
        val quantity = objetos[nombreObjeto] ?: return false
        if (quantity > 0) {
            objetos[nombreObjeto] = quantity - 1
            return true
        }
        return false
    }
}