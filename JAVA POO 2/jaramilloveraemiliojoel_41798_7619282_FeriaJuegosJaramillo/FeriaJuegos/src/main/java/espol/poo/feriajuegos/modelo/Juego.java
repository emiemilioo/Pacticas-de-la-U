package espol.poo.feriajuegos.modelo;
//NO MODIFICAR ESTA CLASE
public class Juego {
    private String nombre;
    private int costoMoneda;

    public Juego(String nombre, int costoMoneda) {
        this.nombre = nombre;
        this.costoMoneda = costoMoneda;
    }

    public int getCostoMoneda() {
        return costoMoneda;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean jugar(){
        return false;
    }
    
    
}