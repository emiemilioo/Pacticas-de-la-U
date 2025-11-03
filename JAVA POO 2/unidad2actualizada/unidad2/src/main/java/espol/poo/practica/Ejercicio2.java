/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espol.poo.practica;

import java.util.ArrayList;

/**
 * Ejercicio de práctica de objeto Wrapper a partir de un string
 *
 * @author 
 */
public class Ejercicio2 {
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Double> difTemperatura = new ArrayList<>();
        String info = "15.8-18.9;16.6-19.2;15.5-21.2;14.8-20.1;16.2-18.9;15.4-19.5";
        String[] num= info.split(";");
        for (int i=0; i< num.length ;i++){
            String[] temp =num[i].split("-");
            double temp1 = Double.parseDouble(temp[0]);
            double temp2 = Double.parseDouble(temp[1]);
            double diferencia = temp2 - temp1 ;
            difTemperatura.add(diferencia);
            
        }
        
        for (Double n : difTemperatura) {
            System.out.printf(" | "+String.format("%.2f",n)+" | ");
        }
        //a partir de la variable info extraer las temperaturas y almacenar la diferencia en la lista difTemperatura
   
        
       
    }
}
