import java.util.Scanner;

public class Año {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);


        System.out.print("Ingrese el 1er Año: ");
        int año1=sc.nextInt();
        if ((año1 % 4 == 0 && año1 % 100 !=0) || (año1 % 400 == 0)){
            System.out.println("El año " + año1 + " si es bisiesto!");
        }else{
            System.out.println("El año " + año1 + " no es bisiesto D:");
        }

        System.out.print("Ingrese el 2do Año: ");
        int año2=sc.nextInt();
        if ((año2 % 4 == 0 && año2 % 100 != 0) || (año2 % 400 == 0)){
            System.out.println("El año " + año2 + " si es bisiesto!");
        }else{
            System.out.println("El año " + año2 + " no es bisiesto D:");
        }

        System.out.print("Ingrese el 3er Año: ");
        int año3=sc.nextInt();
        if ((año3 % 4 == 0 && año3 % 100 != 0) || (año3 % 400 == 0)){
            System.out.println("El año " + año3 + " si es bisiesto!");
        }else{
            System.out.println("El año " + año3 + " no es bisiesto D:");
        }

        System.out.print("Ingrese el 4to Año: ");
        int año4=sc.nextInt();
        if ((año4 % 4 == 0 && año4 % 100 != 0) || (año4 % 400 == 0)){
            System.out.println("El año " + año4 + " si es bisiesto!");
        }else{
            System.out.println("El año " + año4 + " no es bisiesto D:");
        }

        System.out.print("Ingrese el 5to Año: ");
        int año5=sc.nextInt();
        if ((año5 % 4 == 0 && año5 % 100 != 0) || (año5 % 400 == 0)){
            System.out.println("El año " + año5 + " si es bisiesto!");
        }else{
            System.out.println("El año " + año5 + " no es bisiesto D:");
        }

        sc.close();

    }
}
