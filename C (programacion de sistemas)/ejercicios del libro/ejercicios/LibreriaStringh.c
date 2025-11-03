#include <stdio.h>
#include <string.h>

int main(){
    char password[80];
    printf("Ingresa la contraseña: ");
    fgets(password, sizeof(password),stdin);
    if(strcmp(password,"Acceso1234/")==0)
        puts("Correcto, acceso autorizado! ");
    else puts("Incorrecto, no tiene acceso :C");
    return 0;
}