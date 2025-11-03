package espol.poo.modelo;
import java.util.ArrayList;
import java.util.Random;

public class Servidor {
    private String nombre;
    private String ip;
    private String clave;
    private int cantidadProcesadores;
    private int capacidadDisco;
    private int memoria;

    public Servidor(String nombre, String ip, int cantidadProcesadores, int capacidadDisco, int memoria){
        this.nombre=nombre;
        this.ip=ip;
        this.cantidadProcesadores = cantidadProcesadores;
        this.capacidadDisco = capacidadDisco;
        this.memoria = memoria;
    }

    public String getNombre(){
        return nombre;
    }

    public String getIp(){
        return ip;
    }

    public String getClave(){
        return clave;
    }

    public int getCantidadProcesadores(){
        return cantidadProcesadores;
    }

    public int getCapacidadDisco(){
        return capacidadDisco;
    }

    public int getMemoria(){
        return memoria;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public void setIp(String ip){
        this.ip=ip;
    }

    public void setClave(String clave){
        this.clave=clave;
    }

    public void setCantidadProcesadore(int cantidadProcesadores){
        this.cantidadProcesadores=cantidadProcesadores;
    }

    public void setCapacidadDisco(int capacidadDisco){
        this.capacidadDisco=capacidadDisco;
    }

    public void setMemoria(int memoria){
        this.memoria=memoria;
    }

    public void actualizarClave(){
        char[] letras= {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z', '@', '_'};
        String nuevaClave = "";
        Random aleatorio = new Random();
        for (int i =0; i<8 ;i++){
            int indice = aleatorio.nextInt(letras.length);
            nuevaClave += letras[indice];
        }
        clave=nuevaClave;
    }
    
    public void mostrarInformacion(){
        System.out.println("Nombre: " + nombre + ", IP: " + ip + ", Clave: " + clave);
    }

 /*    public static void buscarSevidor(ArrayList<Servidor> servidores, String ipConsultar){
        for (int i=0; i<servidores.size(); i++){
            Servidor s= servidores.get(i):
            if (s.equals(ipConsultar));

        }
    } */

}
