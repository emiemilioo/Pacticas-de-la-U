/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espol.poo.practica;

/**
 * 
 * @author 
 */

//1.- Revisa el código y predice cuál será la salida
//2.- Ejecuta el código y compara las respuestas. Existió algún proceso de autoboxing?
//3.- Comenta el método writeValue(int a, double b).
//4.- Ejecuta el código y reflexiona acerca de la salida obtenida
public class Ejercicio3 {
    public void writeValue(int a, byte b) {
        System.out.println("Byte " + a + b);
    }
    public void writeValue(int a, short b) {
        System.out.println("Int " + a + b);
    }
    public void writeValue(int a, Integer b) {
        System.out.println("Integer " + a + b);
    }
    /*public void writeValue(int a, double b) {
        System.out.println("double " + a + b);
    }*/
    public static void main(String[] args) {
        new Ejercicio3().writeValue(2, 5);
        new Ejercicio3().writeValue(2, Integer.valueOf("5"));
    }
}

/*

RESPUESTAS:

1)Se ejecutarán el 3er y 4to método.
2)No ya que el código da distintos constructores para evitar eso.
3)Si se comento el metodo "writeValue(int a, double b)"
4)Una vez comentado el método si hay un proceso de autoboxing ya que el tipo primitivo pasa a un tipo Wrapped.


*/