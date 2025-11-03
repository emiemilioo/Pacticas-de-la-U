package Leccion2;

public class Zorro extends Personaje{
    private int velocidad;

    public Zorro(String n, int p, int v){
        super(n, p);
        velocidad=v;
    }

    @Override
    public void recolectar(Alimento comida){
        if (comida instanceof Fruta){
            puntos+=velocidad;
        }else{
            puntos+=(comida.getPuntos());
        }
    }
    @Override
    public String toString(){
        return "El Zorro "+nombre+" tiene "+puntos+" puntos.";
    }
}
