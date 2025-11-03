package espol.poo.feriajuegos.modelo;

import java.util.ArrayList;
import java.util.Scanner;
public class Feria {
    private ArrayList<Juego> juegos;
    private Jugador jugador;

    public Feria() {
        juegos = new ArrayList<>();
        inicializar();
    }

    private void inicializar() {
        //COMPLETAR DE ACUERDO A LAS INSTRUCCIONES
        Jugador jugador= new Jugador("Emilio",15);
        juegos.add(new JuegoDado(2,"Lanza los dados", 2));
        juegos.add(new JuegoDado(1,"Dado Magico", 1));
        juegos.add(new JuegoAdivinaNumero(3,"Adivina el numero", 0));
    }

    public void simularParticipacion() {
        Scanner sc= new Scanner(System.in);
        System.out.println("¡Bienvenido a la feria de minijuegos!\n");
        while(jugador.getMonedas()>0){
            System.out.println("Que juego deseas jugar?");
            int num= sc.nextInt();
            sc.nextLine();
            if(num==1){
                juegos.get(1).jugar();
            }
            if(num==2){
                juegos.get(2).jugar();
            }
            if(num==3){
                juegos.get(3).jugar();
            }
            
        }
        jugador.resumen();
        //COMPLETAR DE ACUERDO A LAS INSTRUCCIONES
    
    }
}
