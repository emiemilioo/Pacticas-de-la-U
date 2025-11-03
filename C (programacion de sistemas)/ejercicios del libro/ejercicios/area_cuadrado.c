//aqui nos dice que  que solo nos dan  la variable l  que nos sirve para declarar nuestro lado del cuadrado 
#include <stdio.h>
#include <math.h>
int area(int l);

int main(){
    int l, calculo;
    printf("ingrese la medida del lado de su cuadrado: ");
    scanf("%d",&l);
    calculo=area(l);
    printf("el resultado es: %d", calculo);
    return 0;
}

int area(int l){
    return pow(l,3);
}