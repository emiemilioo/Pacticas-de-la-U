#include <stdio.h>
#include <math.h>

double determinante(double a, double b, double c);

int main(){
    double a,b,c,x1,x2;
    printf("Ingrese los valores de a, b y c: ");
    scanf("%lf %lf %lf", &a,&b,&c);
    if(a!=0){
        if (determinante(a,b,c)>0)
        {
            x1=(-b + sqrt(determinante(a,b,c)))/(2*a);
            x2=(-b - sqrt(determinante(a,b,c)))/(2*a);
            printf("Las raices son diferentes y son %.2lf, %.2lf",x1,x2);

        }else if (determinante(a,b,c)==0)
        {
            x1=-b/(2*a);
            printf("Las raices son iguales y son %.2lf, %.2lf", x1,x1);
        }else
        {
            x1=-b/(2*a);
            x2=sqrt(fabs(determinante(a,b,c)))/(2*a);
            printf("Las raices son diferentes y complejas y son son %lf+%.2lf i, %lf-%.2lf i",x1,x2,x1,x2);
        }
    }else{
        printf("No es ecuacion cuadratica");
    }
    return 0;
    
}

double determinante(double a, double b, double c){
    return pow(b,2) - ((4*a)*c); 
}