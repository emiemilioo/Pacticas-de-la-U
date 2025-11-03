/*
 * - 2. Tabla de multiplicar: 
 * Pide al usuario que ingrese un número entero y muestra la tabla de multiplicar del 1 al 12 para ese número. 
 */
import java.util.Scanner;

public class Tabla {
    public static void main (String[]args){
        Scanner sc= new Scanner (System.in);
        System.out.print("Ingrese un numero: ");
        int numero= sc.nextInt();
        for (int i = 1; i<=12; i++ ){
            System.out.println(i+ " x " + numero+ " = " + (numero * i));
        }
        sc.close();
    }
}