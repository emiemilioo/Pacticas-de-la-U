/*
1. Escribir un programa que solicite al usuario la base 
y altura de un triángulo y calcule su área. 

Ejemplo de salida

Ingrese base del triángulo:10
Ingrese altura del triángulo:42
El área es: 210.0
 */
import java.util.Scanner;

public class Triangulo {
    public static void main (String[]args) {
        Scanner sc= new Scanner (System.in);

        System.out.print("Ingresa base del triangulo: ");
        int base= sc.nextInt();

        System.out.print(("Ingresa altura del triangulo: "));
        int altura= sc.nextInt();

        double area= calcularArea(base, altura);
        System.out.println("El area es: "+ area);
        sc.close();

    }

    public static double calcularArea(int base, int altura){
        return (base*altura)/2.0;
    }
}