using System;

Console.Write("Quantidade no estoque: ");
int quantidad = int.Parse(Console.ReadLine() ?? "0");

if (quantidade < 0) {
    Console.WriteLine("Quantidade inválida. ");
} else if (quantidade == 0) {
    Console.WriteLine("Produto esgotado.");
} else if (quantidade <= 5) {
    Comsole.WriteLine("Estoque baixo.");
} else {
    Console.WriteLine("Estoque disponível.");
}
