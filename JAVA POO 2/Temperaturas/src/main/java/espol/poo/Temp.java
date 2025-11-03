package espol.poo;
import espol.poo.datos.Temperatura;
import java.util.Scanner;

public class Temp{
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int contador=0;
        System.out.println("Cuantas temperaturas desea ingresar?: ");
        int limite = sc.nextInt();
        sc.nextLine();
        for (int i =1; i<=limite; i++ ){

            System.out.println("Ingrese su temperatura"+i+" : ");
            int t = sc.nextInt();
            sc.nextLine();
            Temperatura temp = new Temperatura(t);
            temp.mostrarInformacion();
            if (temp.esfiebre()){
                contador+=1;
            }            
            
        }
        System.out.println("Total de personas que tienen fiebre: "+contador);
        Temperatura.mostrarTotalLecturas();
        sc.close();

    
    }
}