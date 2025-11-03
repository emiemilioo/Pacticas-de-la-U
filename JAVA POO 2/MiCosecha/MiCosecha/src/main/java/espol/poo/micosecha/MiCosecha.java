/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package espol.poo.micosecha;

import espol.poo.micosecha.modelo.Fruta;
import espol.poo.micosecha.modelo.Personaje;

//import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;


/**
 *
 * @author Gladys
 */
public class MiCosecha {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Ingrese un nombre para el personaje principal: ");
        String nombreingresado= sc.nextLine();
        Personaje personaje1= new Personaje(nombreingresado,true);

        System.out.println("Ingrese el nombre del zorro: ");
        String nombrezorro= sc.nextLine();
        Personaje personaje2= new Personaje(nombrezorro);

        System.out.println("Ingrese nombre de la fruta 1: ");
        String nombrefruta1 = sc.nextLine();
        System.out.println("Ingrese calorias de la fruta 1: ");
        int clfrut1 = sc.nextInt();
        sc.nextLine();
        Fruta fruta1 = new Fruta(nombrefruta1, clfrut1);

        System.out.println("Ingrese nombre de la fruta 2: ");
        String nombrefruta2 = sc.nextLine();
        System.out.println("Ingrese calorias de la fruta 2: ");
        int clfrut2 = sc.nextInt();      
        sc.nextLine();
        Fruta fruta2 = new Fruta(nombrefruta2, clfrut2);

        personaje1.recolectar(fruta1);
        personaje2.recolectar(fruta2);

        personaje1.mostrarInformacion();
        personaje2.mostrarInformacion();

        sc.close();
    }
}
