package espol.poo.modelo;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
//completar para que se pueda serializar y ordenar

import javax.sound.sampled.SourceDataLine;
public class Jugador implements Serializable {
    private String nombre;
    private String posicion;
    private EquipoFutbol equipo;
    private int numeroJugador;

    public Jugador(String nombre, String posicion, EquipoFutbol equipo, int numeroJugador) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.equipo = equipo;
        this.numeroJugador= numeroJugador;
    }



    public String getNombre() {
        return nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public EquipoFutbol getEquipo() {
        return equipo;
    }

    public int getNumeroJugador() {
        return numeroJugador;
    }

    
    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", posicion=" + posicion + ", equipo=" + equipo + ", numero de Jugador="+'}';
    }


    public static ArrayList<Jugador> obtenerJugadores(String ruta){
         ArrayList<Jugador> jugadores = new  ArrayList<>();
        //completar para leer el archivo y llenar la lista
        int contador=1;
        try (BufferedReader br= new BufferedReader(new FileReader(ruta))){
            String linea;

            while ((linea=br.readLine()) != null){
                String[] partes = linea.split(",");
                if(partes.length==4){
                    String nombre=partes[0].trim();
                    String posicion=partes[1].trim();
                    String nombreEquipo=partes[2].trim();
                    String abre=partes[3].trim();
                    EquipoFutbol equipo = new EquipoFutbol(nombreEquipo, abre);
                    Jugador jugador= new Jugador(nombre, posicion, equipo,contador);
                    jugadores.add(jugador);
                    contador++;
                }
            }
        } catch(IOException e) {
            System.out.println(e);
        }
        return jugadores;
    }

    public static void guardarLista(List<Jugador> jugadorees, String rutaArchivo){
        try (ObjectOutputStream out= new ObjectOutputStream(new FileOutputStream(rutaArchivo))){
            out.writeObject(jugadorees);
        }catch(IOException e){
            System.out.println(e);
        }
    }
    
    public static List<Jugador> leerLista(String ruta){
        List<Jugador> jugadores =  new ArrayList<>();
        try (ObjectInputStream in= new ObjectInputStream(new FileInputStream(ruta))){
            jugadores=(List<Jugador>) in.readObject();
        }catch(IOException | ClassNotFoundException e){
            System.out.println(e);
        }
        return jugadores;
    }
    
    
    
    






           
}
