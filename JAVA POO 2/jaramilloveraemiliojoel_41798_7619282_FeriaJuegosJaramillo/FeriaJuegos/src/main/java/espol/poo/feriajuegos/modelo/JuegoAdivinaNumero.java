package espol.poo.feriajuegos.modelo;

public class JuegoAdivinaNumero extends Juego{
    private int numeroCorrecto;

    public JuegoAdivinaNumero(int numeroCorrecto, String nombre, int costoMoneda) {
        super(nombre, costoMoneda);
        this.numeroCorrecto = numeroCorrecto;
    }
    
    @Override
    public boolean jugar(){
        numeroCorrecto= (int)(5*Math.random()+1);
        int numJugador= (int)(5*Math.random()+1);
        return numJugador==numeroCorrecto;
        
    }
    
    public void mostrarNumeroCorrecto(){
        System.out.println("El numero correcto era "+numeroCorrecto);
        
    }
    
    
}