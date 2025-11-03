package espol.poo.modelo;

import java.util.ArrayList;
import java.io.*;
import espol.poo.utils.*;

public class Equipo{
    private String codigo;
    private String descripcion;
    private float costoAlquiler;
    private int stock;
    
    public Equipo(String codigo) {
        this.codigo = codigo;
    }
    public Equipo(String codigo, String descripcion, float costoAlquiler, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.costoAlquiler = costoAlquiler;
        this.stock = stock;
    }
    
    public float calcularValorAlquiler(int dias)
    {
        return dias * costoAlquiler;
    }

    public String getCodigo(){
      return codigo;
    }
    public int getStock(){
      return stock;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj != null && obj.getClass()==this.getClass()) {
         Equipo other = (Equipo) obj;
         return codigo.equals(other.codigo);
        }
        return false;
    }

    @Override        
    public String toString() {
        return String.format("%8s\t%35s\t%8.2f\t%5d", codigo, descripcion, costoAlquiler,stock);
    }
    





}
