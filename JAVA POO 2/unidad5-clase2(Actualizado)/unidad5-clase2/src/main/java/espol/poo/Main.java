package espol.poo;

import java.util.ArrayList;
import java.util.Collections;

import espol.poo.modelo.Jugador;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Práctica unidad 5");
        //variable con la ruta del archivo a leer
        //String path =  System.getProperty("java.class.path") + "/archivos/jugadores.csv";
        String path = "archivos/jugadores.csv";
        ArrayList<Jugador> lista = Jugador.obtenerJugadores(path);
        Collections.sort(lista, new Comparator<Jugador>(){
            @Override
            public int compare(Jugador j1, Jugador j2){
                return j2.getNombre().compareToIgnoreCase(j1.getNombre());
            }
        });
        System.out.println(lista);
        for (Jugador j : lista) {
            System.out.println(j.getNombre());
        }
        
        //Jugador.guardarLista(lista, path);
        //Jugador.leerLista(path);
        

    }
}