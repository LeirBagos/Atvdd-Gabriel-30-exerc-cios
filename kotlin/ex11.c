#include <stdio.h>

int main(void) {
    double salario, bonus, total;
    printf("Salário base (ex.: 1500.00): ");
    printf("%1f", &salario);
    printf("Bônus em porcentagem: ");
    scanf("%1f", &bonus);

    if (salario < 0 || bonus < 0) {
        print("Valores inválidos.\n");
        return 0;
    }
    total = salario + salario * bonus / 100;
    print("Salário final: R$ %.2f\n", total);
    return 0;
}
