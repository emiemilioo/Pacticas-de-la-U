#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <time.h>

int main(){
    int numInicial, numFinal, numero;
    printf("Ingrese un numero: ");
    scanf("%d",&numInicial);
    printf("Ingrese otro numero: ");
    scanf("%d",&numFinal);
    srand(time(NULL)); //LINEA IMPORTANTE PARA QUE FUNCIONE LOS NUMEROS AL AZARS
    numero = rand() % (numFinal-numInicial+1)+numInicial;
    printf("El numero seleccionado al azar: %d",numero);
    return 0;
}