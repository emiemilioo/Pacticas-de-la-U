package espol.poo.practica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Persona> personas = new ArrayList<>();
        for (int i = 1 ; i<4 ; i++){
            System.out.print("Persona "+ i + " nombre : ");
            String nom = sc.nextLine();
            System.out.print("Persona "+ i + " altura : ");           
            float alt = sc.nextFloat();
            sc.nextLine();
            System.out.println("  ");
            personas.add(new Persona(nom,alt));
            
        }
        for (Persona n : personas) {
            System.out.print(" | "+ n +" | ");
        }
        System.out.println(" ");
        System.out.println(" Las alturas obtenidas fueron: "+Arrays.toString(convertirAlturas(personas)));
        sc.close();
    }

    public static int[] convertirAlturas(ArrayList<Persona> personas){
        int[] alturas = new int[personas.size()];
        for (int i = 0; i < personas.size(); i++) {
            alturas[i] = (int) personas.get(i).getAltura(); 
        }
        return alturas;
    }
}
