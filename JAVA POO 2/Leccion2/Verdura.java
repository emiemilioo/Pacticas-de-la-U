package Leccion2;

public class Verdura extends Alimento {
    private PartePlanta parte;

    public Verdura(String n, int c, PartePlanta parte){
        super(n, c);
        this.parte=parte;
    }

    
    public boolean esRaizOTuberculo(){
        if (parte==PartePlanta.RAICES || parte==PartePlanta.TUBERCULOS){
            return true;
        }else{
            return false;
        }
    }

}

