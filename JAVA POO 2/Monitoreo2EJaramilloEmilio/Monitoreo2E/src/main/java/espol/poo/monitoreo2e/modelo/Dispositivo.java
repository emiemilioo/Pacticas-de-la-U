package espol.poo.monitoreo2e.modelo;

public abstract class Dispositivo {
    private String id;
    private String ubicacion;
    
    //NO MODIFIQUE EL CÓDIGO DE ESTE MÉTODO
    public Dispositivo(String id, String ubicacion) {
        this.id = id;
        this.ubicacion = ubicacion;
    }
    //NO MODIFIQUE EL CÓDIGO DE ESTE MÉTODO
    public String getId() {
        return id;
    }
    
    public abstract void calibrar();
    
}

