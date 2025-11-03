package espol.poo.modelo;

import java.util.ArrayList;
import java.io.*;
import java.util.Collections;
import espol.poo.utils.*;

public class Equipo implements BienAsegurado, Comparable <Equipo>{
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
        return dias* costoAlquiler;
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

    @Override
    public void asegurar(int dias) {
        Misc.asegurarEquipo(dias);
    }

    @Override
    public int compareTo(Equipo otroEquipo) {
        return this.descripcion.compareTo(otroEquipo.descripcion); 
    }
    
    public static ArrayList<Equipo> cargarEquipos(String ruta){
        ArrayList<Equipo> Equipos = new ArrayList<>();
        File archivo = new File(ruta);
        try(BufferedReader entrada=new BufferedReader(new FileReader(archivo))){
            entrada.readLine();
            String linea= entrada.readLine();
            while (linea !=null){
                String[] partes = linea.split(",");
                String codigo=partes[0].trim();
                String descripcion=partes[1].trim();
                float costo= (float) Double.parseDouble(partes[2].trim());
                int stock= Integer.parseInt(partes[3].trim());
                Equipo e= new Equipo(codigo,descripcion,costo,stock);
                Equipos.add(e);
                linea= entrada.readLine();
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex){
            ex.printStackTrace(System.out);
        }
        return Equipos;
    }
    
    public static int consultarCantidadPrestamos(String codEquipo, String ruta){
        File archivo= new File(ruta);
        int contador=0;
        try(BufferedReader entrada= new BufferedReader(new FileReader(archivo))){
            entrada.readLine();
            String linea= entrada.readLine();
            while(linea!=null){
                String[] partes=linea.split(",");
                for(String equipo: partes){
                    if(partes[0].equals(codEquipo)){
                        ++contador;
                    }
                }
                linea= entrada.readLine();
            }
        }catch(FileNotFoundException ex){
            ex.printStackTrace(System.out);
        }catch(IOException ex){
            ex.printStackTrace(System.out);
        }
        return contador;
    }
    





}
