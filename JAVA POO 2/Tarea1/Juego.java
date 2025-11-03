/*
 * Escribir un programa que simule el juego de la adivinanza de un número. 
 * El ordenador debe generar un número aleatorio entre 1 y 100 y el usuario 
 * tiene cinco oportunidades para acertarlo. Después de cada intento el programa 
 * debe indicarle al usuario si el número introducido por él es mayor, 
 * menor o igual al número a adivinar, y el número de intentos restantes. 
 * 
Nota: para generar el valor aleatorio puede emplearse la sentencia:
short x  = (short) (100*Math.random()+1);
 */

import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        short x  = (short) (100*Math.random()+1);
        System.out.println("¡Adivine el nùmero!");
        System.out.println(x);
        System.out.print("Ingrese un numero: ");
        int num= sc.nextInt();
        System.out.println(" ");
        int intentos = 5;


        while (intentos>0 && num!=x){
            if (num>x){
                System.out.println("El numero ingresado es mayor al generado");
            }else{
                System.out.println("El numero ingresado es menor al generado");
            }

            intentos--;
            System.out.println("Numero de intentos: " + intentos);

            if (intentos > 0) {
                System.out.print("Ingrese un número: ");
                num = sc.nextInt();
                System.out.println(" ");

            }
        }

        if (num==x){
            System.out.println("¡Adivino el numero! ¡Felicidades!");
        }else{
            System.out.println("Se ha quedado sin intentos, el numero a adivinar era... " + x);
        }

        sc.close();
    }
}
