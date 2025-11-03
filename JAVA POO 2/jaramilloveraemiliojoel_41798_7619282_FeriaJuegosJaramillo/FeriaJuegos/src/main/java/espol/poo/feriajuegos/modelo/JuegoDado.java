package espol.poo.feriajuegos.modelo;

public class JuegoDado extends Juego{
    private int numDados;

    public JuegoDado(int numDados, String nombre, int costoMoneda) {
        super(nombre, costoMoneda);
        this.numDados = numDados;
    }
    
    
    @Override
    public boolean jugar(){
        if (numDados==1){
            int valorDado= (int) (6*Math.random()+1);
            System.out.println("Lanzastes el dado: "+valorDado);
            return valorDado==6;

        }else if(numDados==2){
            int valorDado1= (int) (6*Math.random()+1);
            int valorDado2= (int) (6*Math.random()+1);
            System.out.println("Lanzastes los dados: "+valorDado1+" y "+valorDado2);
            return valorDado1==valorDado2;   
        }
        return false;
    } 
}