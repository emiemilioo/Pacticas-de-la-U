#include <stdio.h>
#include <math.h>

const double notaMinima = 60.0;

int main(){
    double notaIngresada;
    printf("Ingrese su nota:");
    scanf("%lf",&notaIngresada);
    if (notaIngresada>=notaMinima)
    {
        printf("Ud aprobo la materia!");
    }else{
        printf("ud reprobo la materia");
    }
    return 0;
}

