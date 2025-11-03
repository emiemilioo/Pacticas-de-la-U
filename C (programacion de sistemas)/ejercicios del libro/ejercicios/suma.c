#include <stdio.h>
int suma(int n1, int n2);

int main(){
    int n1,n2, resultado;
    printf("ingrese su primer numero: ");
    scanf("%d",&n1);
    printf("ingrese su segundo numero: ");
    scanf("%d",&n2);
    resultado = suma(n1,n2);
    printf("El resultado es: %d", resultado);
    return 0;
}

int suma(int n1, int n2){
    return n1+n2;
}
