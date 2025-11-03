/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espol.poo.practica;

/**
 *
 * @author Gladys
 */
public class Persona {
    private String nombre;
    private float altura;
    
    public Persona(){
        this.nombre="No registrado";
    }
    
    public Persona(String nombre, float altura){
        this.nombre=nombre;
        this.altura=altura;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public float getAltura(){
        return altura;
    }
    
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    
    public void setAltura(float altura){
        this.altura=altura;
    }
  
    @Override
    public String toString() {
    return "Nombre: " + nombre + ", Altura: " + altura;
}
 
}
