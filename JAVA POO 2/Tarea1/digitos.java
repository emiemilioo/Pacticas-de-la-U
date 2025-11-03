import java.util.Scanner;
public class digitos {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("Ingrese su numero: ");
        int num= sc.nextInt();
        int numMostrar= num;
        int contador=0;
        while (num>0){
            int digito=num%10;
            contador+=digito;
            num=num/10;
        }
        System.out.println("La suma de los digitos de la cifra " + numMostrar + " es de " + contador);
        sc.close();
    }
}
