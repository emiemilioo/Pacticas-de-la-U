#include <stdio.h>
#include <math.h>
#include <string.h>

void imprimirArreglo(int arr[], int n); 

int main(){
    int a[15],b[15],totalNumArreglos, i,j;
    printf("Ingrese la cantidad de numeros del arreglo: ");
    scanf("%d",&totalNumArreglos);

    for (i = 0; i < totalNumArreglos; i++)
    {
        printf("ingrese el valor a ingresar: ");
        scanf("%d",&a[i]);
    }
    
    printf("El arreglo es: ");
    imprimirArreglo(a,totalNumArreglos);
    
    for(i=0, j=totalNumArreglos-1;i<totalNumArreglos&&j>=0; i++,j--)
    b[i]=a[j];
    printf("EL arreglo invertido es: ");
    imprimirArreglo(b,totalNumArreglos);

    return 0;
} 

void imprimirArreglo(int arr[], int n) {
    printf("[");
    for (int i = 0; i < n; i++) {
        printf("%d", arr[i]);
        if (i < n - 1) printf(", ");
    }
    printf("]\n");
}