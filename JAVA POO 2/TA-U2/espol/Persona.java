package modelo;

import java.util.ArrayList;

public class Persona {
    private String id;
    private String nombre;
    private ArrayList<Mascota> lstMascotas = new ArrayList<>();

    public Persona(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void adoptar(Mascota m) {
        lstMascotas.add(m);
        m.setDueno(this);
    }

    @Override
    public String toString() {
        return "ID: " + id + ", nombre: " + nombre + ", adopciones: " + lstMascotas.size();
    }
}
