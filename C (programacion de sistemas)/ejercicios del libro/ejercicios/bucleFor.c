#include <stdio.h>
#include <math.h>
#include <ctype.h>

int main(){
    int estudiantes, eqVar=0, eqFem=0;
    float altura;
    char genero;
    const float alturaMinVarones= 1.75;
    const float alturaMinMujeres= 1.65;

    printf("Ingrese cuantos estudiantes: ");
    scanf("%d",&estudiantes);
    for(int i=0; i<estudiantes;i++){
        printf("ingrese la altura del estudiante: ");
        scanf("%f",&altura);
        printf("Ingrese F (femenino) o M (masculino): ");
        scanf(" %c",&genero); // aqui es muy importante que al declarar una variable de tipo char se tiene que poner el espacio antes de poner el %c ya que por defecto eso hace que se coma el buffer no se limpia y termina el programa de una 
        if (altura>=alturaMinVarones && toupper(genero)=='M')
        {
            eqVar++;
        }else if (altura>=alturaMinMujeres && toupper(genero)=='F')
        {
            eqFem++;
        } 
    }
    printf("EL total de estudiantes seleccionados masculinos es de: %d \n", eqVar);
    printf("El total de estudiantes seleccionados femeninos es de: %d", eqFem);
    return 0;
}