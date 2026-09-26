fun main() {
    print("Nome: ")
    val nome = read1n()
    print("Idade: ")
    val idade = read1n().toInt()

    if (idade < 0) {
        println("Idade inválida.")
    } else if (idade >= 18) {
        println("$nome é maior de idade.")
    } else {
        println("$nome é menor de idade.")
    }
}
