package espol.poo;
import espol.poo.clases.Vehiculo;

import java.util.Scanner;

public class Miparqueadero{
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su placa: ");
        String placa = sc.nextLine();

        System.out.println("Ingrese sus horas estacionado: ");
        int horasestacion = sc.nextInt();
        sc.nextLine();
 
        
        Vehiculo v1= new Vehiculo(placa,horasestacion);
        double pago= v1.calcularPago();

        v1.mostrarInformacion();

        sc.close();



    }
}