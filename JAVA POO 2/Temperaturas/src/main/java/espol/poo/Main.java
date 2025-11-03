package espol.poo;
import espol.poo.datos.Temperatura;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("ingrese su temperatura: ");
        int t1= sc.nextInt();
        sc.nextLine();
        Temperatura temp1 = new Temperatura(t1);

        System.out.println("Ingrese su temperatura: ");
        int t2 = sc.nextInt();
        sc.nextLine();
        Temperatura temp2 = new Temperatura(t2);
    
        System.out.println(" ");
        temp1.mostrarInformacion();
        temp2.mostrarInformacion();
        Temperatura.mostrarTotalLecturas();

        sc.close();

    
    }
}