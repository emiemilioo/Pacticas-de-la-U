#include <stdio.h>
#include <math.h>

int main(){
    double num, prod;
    prod=1;
    printf("ingrese un numero: ");
    scanf("%lf", &num);


    while (num!=0)
    {
        prod*=num;
        printf("ingrese otro numero: ");
        scanf("%lf", &num);
    }
    printf("El resultado del producto es: %.2lf ", prod);
    return 0;
}