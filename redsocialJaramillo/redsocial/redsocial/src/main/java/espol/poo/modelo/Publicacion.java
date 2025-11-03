package espol.poo.modelo;
//clase base
public class Publicacion implements Compartible, Comparable<Publicacion> {
    private int id;
    private String contenido;
    private int comentarios;
    private int reacciones;

    public Publicacion(int id, String contenido, int comentarios, int reacciones) {
        this.id = id;
        this.contenido = contenido;
        this.comentarios = comentarios;
        this.reacciones = reacciones;
    }
    //no modifique este código
    public double calcularPopularidad(){
        return (2*reacciones) + comentarios;
    }

    public int getId() {
        return id;
    }

    public int getComentarios() {
        return comentarios;
    }

    public int getReacciones() {
        return reacciones;
    }
    
    

    public String getContenido() {
        return contenido;
    }

    //completar de acuerdo a las instrucciones

    @Override
    public String compartir() {
        return "Publicacion " + this.getId() + " compartida";
    }

    /*@Override
    public int compareTo(Object o) {
        
    }*/
    
    @Override
    public String toString(){
        return "Pub: " + this.getId() + " - Popularidad: " + this.calcularPopularidad();
    }

    @Override
    public int compareTo(Publicacion o) {
        return Double.compare(o.calcularPopularidad(),this.calcularPopularidad());
    }

    
 
    
    
        
    

}
