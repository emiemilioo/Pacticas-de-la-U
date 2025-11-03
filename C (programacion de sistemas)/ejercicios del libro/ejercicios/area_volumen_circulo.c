#include <stdio.h>
#include <math.h>

const double pi=3.141659;
double area(double pi, int r);
double volumen(double pi, int r);

int main(){
    int r;
    double resultado_area, resultado_volumen;
    printf("Ingrese la medida de su radio en cm: ");
    scanf("%d",&r);
    resultado_area=area(pi,r);
    resultado_volumen=volumen(pi,r);
    printf("El area de su circulo es de %.2f en cm \n",resultado_area);
    printf("El volumen de su circulo es de %.2f en cm",resultado_volumen);
    return 0;
}

double area(double pi, int r){
    return pi * (pow(r,2));
}

double volumen(double pi, int r){
    return 4/3 * pi * (pow(r,3));
}