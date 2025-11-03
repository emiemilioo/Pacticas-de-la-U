import java.util.Scanner;
public class Numero {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int acumulador = 0;
        int repeticiones = 0;
        int num;

        System.out.print("Ingrese un numero: ");
        num= sc.nextInt();

        while(num > 0){
            repeticiones+=1;
            acumulador += num ; 

            System.out.print("Ingrese un numero: ");
            num= sc.nextInt();

        }

        if (repeticiones!=0){
            double promedio = (acumulador/repeticiones);
            System.out.println("El promedio es de: " + promedio);
        }else{
            System.out.println("No hay numeros positivos, no hay promedio D: ");
        }

        sc.close();
    }
}
