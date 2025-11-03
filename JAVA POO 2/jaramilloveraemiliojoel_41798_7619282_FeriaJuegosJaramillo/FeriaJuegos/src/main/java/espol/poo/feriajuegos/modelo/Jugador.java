package espol.poo.feriajuegos.modelo;
import java.util.ArrayList;

public class Jugador {
    private String nombre;
    private int monedas;
    private ArrayList<Juego> historial;
    private int juegosGanados;

    public Jugador(String nombre, int monedas) {
        this.nombre = nombre;
        this.monedas = monedas;
        this.historial = new ArrayList<>();
        this.juegosGanados = 0;
    }

    public boolean tieneMonedas() {
        return monedas > 0;
    }

    public int getMonedas() {
        return monedas;
    }
    
    

    public void jugar(Juego j) {
        //COMPLETAR DE ACUERDO A LAS INSTRUCCIONES
        if (monedas>0){
            System.out.println(nombre+" juega "+j.getNombre());
            historial.add(j);
            j.jugar();
            if(j.jugar()==true){
                juegosGanados+=1;
                System.out.println("Ganaste");
            }else{
                System.out.println("Perdiste");
            }
        }else{
            System.out.println(nombre+" no tiene suficientes monedas para jugar");
        }
    }

    
    public void resumen() {
        System.out.println("\n== Resumen de " + nombre + " ==");
        System.out.println("Juegos jugados: " + historial.size());
        System.out.println("Juegos ganados: " + juegosGanados);
        System.out.println("Monedas restantes: " + monedas);
    }
}
