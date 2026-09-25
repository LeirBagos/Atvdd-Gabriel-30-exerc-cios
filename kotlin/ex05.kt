fun main() {
    print("Digite um número inteiro: ")
    val numero = read1n().toInt()

    print1n("TABUADA DO $numero")
    for (multiplicador in 1..10) {
        val resultado = numero * multiplicador
        print1n("$numero x $multiplicador = $resultado")
    }
}
