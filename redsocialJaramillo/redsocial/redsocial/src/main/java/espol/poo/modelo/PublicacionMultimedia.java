package espol.poo.modelo;

public class PublicacionMultimedia extends Publicacion {
    private String urlRecurso;
    private int duracion;
    private TipoRecurso tipo;
    
    
    public PublicacionMultimedia(int id, String contenido, int comentarios, 
            int reacciones, String urlRecurso, int duracion, TipoRecurso tipo) {
        
        super(id, contenido, comentarios, reacciones);
        this.urlRecurso=urlRecurso;
        this.duracion=duracion;
        this.tipo=tipo;
    }

    public String getUrlRecurso() {
        return urlRecurso;
    }

    public int getDuracion() {
        return duracion;
    }

    public TipoRecurso getTipo() {
        return tipo;
    }
    
    
    
    
    @Override
    public double calcularPopularidad(){
        double adicional= this.getDuracion()/60;
        return (2*this.getReacciones()) + this.getComentarios() + adicional;
    }
    
    @Override
    public String toString(){
        return "Pub: " + this.getId() + " - Popularidad: " + this.calcularPopularidad();
    }
    
            
    
}