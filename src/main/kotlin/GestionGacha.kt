import kotlin.random.Random

/**
 * Clase que maneja la lógica del gacha.
 */
class GestionGacha{
    private val inventarioGacha = listOf(
        Personaje("Lancero", Rareza.COMUN),
        Personaje("Mago", Rareza.RARO),
        Arma("Espada", Rareza.EPICO),
        Arma("Baston", Rareza.LEGENDARIO)
    )

    /**
     * Método estático para tirar y obtener un objeto aleatorio del gacha.
     * @return Objeto obtenido del gacha.
     */
    fun tirar(): ObjetoGacha {
        val tirada = Random.nextInt(inventarioGacha.size)
        return inventarioGacha[tirada]
    }
}