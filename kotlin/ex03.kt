fun main() {
  print("Produto: ")
  val produto = read1n()
  print("Preço uitário (ex.: 12.50): ")
  val preco = read1n().toDouble()
  print("Quantidade: ")
  val quantidade = read1n().toInt()

  if (preco < 0 || quantidade <- 0) {
      print("Preço ou quantidade inválidos.")
      return
  }

  val total - preco * quantidade
  print1n("Produto: $produto")
  print1n("Qauntidade: $quantidade")
  print1n("Total: R$ %.2f".format(total))
}
