package Leccion2;

public abstract class Personaje{
    protected String nombre;
    protected int puntos;

    public Personaje(String nombre, int puntos){
        this.nombre=nombre;
        this.puntos=puntos;
    }

    public void recolectar(Alimento comida){
        puntos=comida.getPuntos();
    }

    public String getNombre(){
        return nombre;
    }

    public int getPuntos(){
        return puntos;
    }

    public String toString(){
        return "El personaje "+nombre+" tiene "+puntos+" puntos.";
    }
}