/**
 * Clase que representa el menú del juego.
 * @property game Objeto Jugar asociado al menú.
 */
class Menu(private val game: Jugar) {
    /**
     * Muestra el menú principal del juego y maneja las selecciones del usuario.
     */
    fun mostrarMenu() {
        println("Bienvenido al programa de gacha y tienda.")

        while (true) {
            println("\nMenú:")
            println("1. Gacha")
            println("2. Tienda")
            println("3. Inventario")
            println("4. Salir")
            print("Seleccione una opción: ")
            when (readlnOrNull()?.toIntOrNull()) {
                1 -> game.jugarGacha()
                2 -> {
                    println("\n¿Qué desea comprar?")
                    print("Ingrese el nombre del artículo: ")
                    val compraArticulo = readlnOrNull() ?: continue
                    game.visitaTienda(compraArticulo)
                }
                3 -> game.mostrarInventario()
                4 -> {
                    println("¡Gracias por jugar!")
                    return
                }
                else -> println("Opción inválida. Por favor, seleccione una opción válida.")
            }
        }
    }
}