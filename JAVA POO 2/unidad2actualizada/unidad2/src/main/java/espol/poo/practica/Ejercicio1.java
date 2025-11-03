/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espol.poo.practica;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Ejercicio de práctica de clases Wrapper y proceso de boxing y unboxing
 *
 * @author 
 */
public class Ejercicio1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /**
     * @param args the command line arguments
     */
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        //1. solicitar números enteros y agregarlos a la lista
        int contador = 0;
        while (contador<11){
            System.out.print("Ingrese el numero: ");
            int num = sc.nextInt();
            sc.nextLine();
            numeros.add(num);
            //Aqui se hace Autoboxing ya que se esta agregrando un tipo primitivo a un array tipo Wrapped y se tiene que convertir el tipo basico int a uno Wrapped Integer.
            contador++;
        }
       
        for (Integer n : numeros) {
            System.out.print(" | "+n+" | ");
        }
       
        System.out.println(" ");
       
       
        //3. llamar a la función suma pares y mostrar el valor de la suma
        System.out.println("La suma de los pares es: "+sumaPares(numeros));
        sc.close();
    }
    //2 completar
   
    public static int sumaPares(ArrayList<Integer> lista) {
        int sum = 0;
        for (Integer i : lista) {
            if (i % 2 ==0){
                sum+=i;
                // Aqui se hace unboxing ya que para que el condicional funcione el tipo Wrapped Integer tiene que operar con un tipo basico int.
            }
        }
        return sum;
    }
}

