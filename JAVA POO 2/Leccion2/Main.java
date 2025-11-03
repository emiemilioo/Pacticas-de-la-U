package Leccion2;
import java.util.*;

public class Main {
    private Zorro zorro;
    private Agricultor agricultor;
    private ArrayList<Alimento> alimentos;
    public Main(){
        this.alimentos = new ArrayList<>();
        this.agricultor = new Agricultor("Emilio", 10);
        this.zorro = new Zorro("Harold", 10, 5);
        alimentos.add(new Fruta("Fresa", 5));
        alimentos.add(new Fruta("Mago", 15));
        alimentos.add(new Fruta("Manzana", 10));
        alimentos.add(new Verdura("Yuca", 10, PartePlanta.TUBERCULOS));
        alimentos.add(new Verdura("Lechuga", 5, PartePlanta.HOJAS));
    }

    public void recolectarAlimentos(){
        for (Alimento a:alimentos){
            agricultor.recolectar(a);
            zorro.recolectar(a);
        }
    }

    public void mostrarInformacion(){
        System.out.println(agricultor);
        System.out.println(zorro);
    }     

    public static void main(String[] args) {
        Main juego = new Main();
        juego.recolectarAlimentos();
        juego.mostrarInformacion();
    }
        
}



