#include <stdio.h>
#include <math.h>

const double pi=3.1416;
double areaCirculo (double r);
double areaCuadrado (double l);
double areatriangulo(double b, double h);

int main(){
    double r,l,b,h;
    char opcion;
    printf("Ingrese la opcion a calcular:\n");
    printf("A) Area del circulo \n");
    printf("B) Area del cuadrado \n");
    printf("C) Area del triangulo \n");
    scanf("%c",&opcion);

    switch (opcion)
    {
    case 'A':
    case 'a':
        printf("Ingrese el valor de su radio de su circulo: ");
        scanf("%lf",&r);
        printf("Area= %.2lf",areaCirculo(r));
        break;
    
    case 'B':
    case 'b':
        printf("Ingrese el valor del lado de su cuadrado: ");
        scanf("%lf",&l);
        printf("Area= %.2lf",areaCuadrado(l));
        break;

    case 'C':
    case 'c':
        printf("Ingrese el valor de la base y altura de su triangulo: ");
        scanf("%lf %lf",&b,&h);
        printf("Area= %.2lf",areatriangulo(b,h));
        break;
    
    default: printf("No existe tal opccion :(");

        break;
    }

}

double areaCirculo(double r){
    return pi * (pow(r,2));
}

double areaCuadrado(double l){
    return (pow(l,4));
}

double areatriangulo(double b, double h){
    return (b*h)/2;
}