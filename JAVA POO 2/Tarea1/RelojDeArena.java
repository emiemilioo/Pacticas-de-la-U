import java.util.Scanner;

public class RelojDeArena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del reloj de arena: ");
        int size = sc.nextInt();

        int ancho = size * 2;
        
        System.out.print("+");
        for (int i = 0; i < ancho; i++) {
            System.out.print("-");
        }
        System.out.println("+");

        for (int i = 0; i < size; i++) {
            System.out.print("|");
            for (int j = 0; j < i; j++) System.out.print(" ");
            for (int j = 0; j < ancho - 2 * i; j++) System.out.print("*");
            for (int j = 0; j < i; j++) System.out.print(" ");
            System.out.println("|");
        }

        for (int i = size - 1; i >= 0; i--) {
            System.out.print("|");
            for (int j = 0; j < i; j++) System.out.print(" ");
            for (int j = 0; j < ancho - 2 * i; j++) System.out.print("*");
            for (int j = 0; j < i; j++) System.out.print(" ");
            System.out.println("|");
        }

        System.out.print("+");
        for (int i = 0; i < ancho; i++) {
            System.out.print("-");
        }
        System.out.println("+");

        sc.close();
    }
}

