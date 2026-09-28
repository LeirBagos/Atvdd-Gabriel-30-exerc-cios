#include <iostream>
using namespace std;

int main() {
    double nota;
    count << "Pontuação (0 a 10):";
    cin >> nota;

    if (nota < 0 || nota > 10) {
      cout << "Pontuação inválida.\n";
    ) else if (nota < 4) {
        cout << "insatisfatório\n";
    } else if (nota < 6) {
        cout << "Regular\n";
    } else if (nota < 8) {
        cout << "Bom\n";
    } else {
        cout << "Execelente\n";
    }
    return 0;
    }
