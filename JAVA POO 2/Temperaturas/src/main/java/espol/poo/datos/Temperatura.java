package espol.poo.datos;

public class Temperatura {
    private int valor;
    private static int cantidadLecturas=0;

    public Temperatura(int valor){
        this.valor=valor;
        cantidadLecturas++;
    }
    
    public boolean esfiebre(){
        return valor>=38;
    }
    
    public void mostrarInformacion(){
        System.out.println("Temperatura: "+valor);
        if (esfiebre()){
            System.out.println("Tiene Fiebre!");
        }else {
            System.out.println("No tiene fiebre !");
        }
    }

    public static void mostrarTotalLecturas(){
        System.out.println("Lecturas: " + cantidadLecturas);
    }

}

