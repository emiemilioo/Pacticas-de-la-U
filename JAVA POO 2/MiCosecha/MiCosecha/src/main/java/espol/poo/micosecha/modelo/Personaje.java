package espol.poo.micosecha.modelo;

public class Personaje{
    private String nombre;
    private int puntosGanados;
    private boolean esPrincipal;

    public Personaje(String nombre, boolean esPrincipal){
        this.nombre=nombre;
        this.puntosGanados=0;
        this.esPrincipal=esPrincipal;
    }

    public Personaje(String nombre){
        this.nombre=nombre;
        this.puntosGanados=0;
        this.esPrincipal=false;
    }

    public String getNombre(){
        return nombre;
    }

    public int getPuntosGanados(){
        return puntosGanados;
    }

    public boolean getEsPrincipal(){
        return esPrincipal;
    }

    public void mostrarInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Puntos ganados: "+ puntosGanados);
        System.out.println("Principal: " + esPrincipal);
    }

    public void recolectar(Fruta fruta){
        puntosGanados+= fruta.getCalorias();
    }


}