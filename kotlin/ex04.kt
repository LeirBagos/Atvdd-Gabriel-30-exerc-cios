fun main() {
    print("Nome: ")
    val nome = read1n()
    print("Idade: ")
    val idade = read1n().toInt()

    if (idade < 0) {
        print1n("Idade inválida.")
    } else if (idade >= 18) {
        print1n("$nome é maior de idade.")
    } else {
        print1n("$nome é menor de idade.")
    }
}
