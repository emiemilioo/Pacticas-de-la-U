package espol.poo;
import java.util.Scanner;
import java.util.ArrayList;
import espol.poo.modelo.Servidor;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        //int contador = 0;
        ArrayList<Servidor> servidores = new ArrayList<>();
        for (int i=0; i<2 ; i++){
            System.out.print("Ingrese nombre del servidor: ");
            String nom= sc.nextLine();

            System.out.print("Ingrese ip del sevidor: ");
            String cla = sc.nextLine();
            
            System.out.print("Ingrese cantidad de procesadores: ");
            int canprocesa = sc.nextInt();
            sc.nextLine();
            
            System.out.print("Ingrese capacidad en memoria: ");
            int memo = sc.nextInt();
            sc.nextLine();

            Servidor s = new Servidor(nom, cla, canprocesa, i, memo);
            s.actualizarClave();

            servidores.add(s);
            

            System.out.println(" ");
        }

        System.out.println("CONSULTAR SERVIDOR");
        System.out.print("¿Desea consultar? : ");
        String respuesta = sc.nextLine();
        System.out.println(" ");
        while (respuesta.equals("si") || respuesta.equals("Si")){
            if (respuesta.equals("si") || respuesta.equals("Si")){
                System.out.print("Ingrese el ip: ");
                String ipIngreso = sc.nextLine();
                boolean encontrado=false;
                for (int i=0; i<servidores.size(); i++){
                    Servidor s= servidores.get(i);
                    if ((s.getIp().equals(ipIngreso))){
                        s.mostrarInformacion();
                        encontrado=true;
                        System.out.println(" ");
                        break;
                    }
                }

                if (!encontrado){
                    System.out.println("Servidor no encontrado :(");
                    System.out.println(" ");
                }
            System.out.print("¿Desea seguir consultando? : ");
            respuesta = sc.nextLine();
            System.out.println(" ");
            }
        }

        sc.close();


        
            
        /* Lo que pedia el problema y entendi pero quise hacer un while para hacer un tipo menu que pida al 
            usuario si desea consultar o no*/




        /* 
        String ipIngreso = sc.nextLine();
        boolean encontrado=false;
        for (int i=0; i<servidores.size(); i++){
            Servidor s= servidores.get(i);
            if ((s.getIp().equals(ipIngreso))){
                s.mostrarInformacion();
                encontrado=true;
            }
        }

        if (!encontrado){
            System.out.println("Servidor no encontrado :(");
        }
        sc.close();*/

    }
}