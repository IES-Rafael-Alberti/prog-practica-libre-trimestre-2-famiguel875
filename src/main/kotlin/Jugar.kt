/**
 * Clase que maneja la lógica del juego.
 */
class Jugar {
    private val gestionGacha = GestionGacha()
    private val tienda = Tienda()
    private val inventario = mutableListOf<ObjetoGacha>()

    /**
     * Función para comenzar el juego y mostrar el menú.
     */
    fun empezar() {
        val menu = Menu(this)
        menu.mostrarMenu()
    }

    /**
     * Método para jugar al gacha y obtener un objeto aleatorio.
     */
    fun jugarGacha() {
        val resultadoGacha = gestionGacha.tirar()
        println("Has obtenido: ${resultadoGacha.nombre} (Rareza: ${resultadoGacha.rareza})")
        inventario.add(resultadoGacha)
    }

    /**
     * Método para visitar la tienda y comprar un artículo.
     * @param compraArticulo Nombre del artículo a comprar.
     */
    fun visitaTienda(compraArticulo: String) {
        println("\nTienda:")
        tienda.objetos.forEach { (objeto, precio) ->
            println("$objeto - Precio: $precio créditos")
        }
        if (tienda.comprar(compraArticulo)) {
            println("¡Compra exitosa! Has adquirido: $compraArticulo")
            inventario.add(Personaje(compraArticulo, Rareza.COMUN)) // Agregamos el objeto comprado al inventario con rareza común
        } else {
            println("Lo siento, el artículo no está disponible o no tienes suficientes créditos.")
        }
    }

    /**
     * Método para mostrar el inventario del jugador.
     */
    fun mostrarInventario() {
        println("\nInventario:")
        inventario.forEachIndexed { index, objeto ->
            println("${index + 1}. ${objeto.nombre} (Rareza: ${objeto.rareza})")
        }
    }
}