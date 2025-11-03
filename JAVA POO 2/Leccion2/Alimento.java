package Leccion2;

public abstract class Alimento {
    protected String nombre;
    protected int puntos;

    public Alimento(String n, int c){ 
        this.nombre=n;
        this.puntos=c;  
    }

    public String getNombre(){
        return nombre;
    }

    public int getPuntos(){
        return puntos;
    }

    public String toString(){
        return "Alimento: "+nombre+" | Puntos: "+puntos;
    }

}
