#include <stdio.h>
#include <math.h>

int main(){
    int num, sum=0, prod=1;
    do{
        printf("Ingrese un numero (si es par se sumara y si no se multiplicara): ");
        scanf("%d", &num);
        if (num % 2 == 0)
        {
            sum+=num;
        }else{
            prod*=num;
        }
        

    }while(sum<=50 && prod<=150);
    
    printf("El resultado de la suma es: %d \n", sum);
    printf("El resultado del producto es: %d \n", prod);
}