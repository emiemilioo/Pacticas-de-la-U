#include <stdio.h>
#include <math.h>

const int maxAlum=50;
const int maxExamMat=10;


int main(){
    float calificaciones[maxAlum][maxExamMat+1], acum, promedioGrupal=0;
    int totalAlum, totalExam, i, j;

    printf("Dame el total de alumnos (maximo 50): ");
    scanf("%d",&totalAlum);

    printf("Dame el numero total de los examenes (maximo 10): ");
    scanf("%d",&totalExam);
    

    for(i=0; i<totalAlum ; i++){
        acum=0;
        for (j=0; j < totalExam; j++)
        {
           printf("Ingrese el examen %d del alumno %d: ", j+1, i+1);
           scanf("%f",&calificaciones[i][j]);
           acum+=calificaciones[i][j];
        }
        calificaciones[i][totalExam]=acum/totalExam;
        promedioGrupal+=calificaciones[i][totalExam];
        
    }

    printf("\nCalificaciones y promedios\n");
    for(i=0; i<totalAlum; i++){
        printf("El Alumno %d tiene las siguientes calificaciones: [",i+1);
        for (j=0; j<totalExam+1;j++)
        {
            if(j<totalExam){
                printf("Nota %d: %.2f, ",j+1,calificaciones[i][j]);
            }else{
                printf("Promedio: %.2f",calificaciones[i][j]);
            }
        }
        printf(" ]\n");
        
    }
    printf("El promedio general es de: %.2f",promedioGrupal/totalAlum);
}