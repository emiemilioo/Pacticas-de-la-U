package Leccion2;

public class Agricultor extends Personaje {
    
    public Agricultor(String n, int p){
        super(n, p);
    }

    @Override
    public void recolectar(Alimento comida){
        if (comida instanceof Fruta){
            puntos+=(comida.getPuntos())*2;
        }else if(comida instanceof Verdura){
            Verdura v = (Verdura) comida;
            if (v.esRaizOTuberculo()){
                puntos+=(comida.getPuntos())+20;
            }else{
                puntos+=(comida.getPuntos())+10;
            }
        }
    }

    @Override
    public String toString(){
        return "El agricultor "+nombre+" tiene "+puntos+" puntos.";
    }

}
