// el for tiene casos especiales propios del lenguaje C
/*
uno de estos es el ( ; ; ), cuando la condicion que es el segundo espacio esta vacio se toma como siempre verdad y se hace un bucle infinito

Tambien esta que el primer espacio se puede incializar mas de una expresion con el operador " , " de la siguiente manera: for ( int i =1, sum=0; ; ) y asi :3
*/


#include <stdio.h>
#include <math.h>

int main(){
    int par=0, impar=0;
    for (int c=1, p=2, i=1; i <= 3; c++, p+=2, i+=2)
    {
        par+=p;
        impar+=i;
    }
    printf("La suma par es de: %d y la impar es de %d", par, impar);
    return 0;
}

//se puede hacer ciclos aniados es decir un while dentro de un for o al reves o un if con while o do while se puede