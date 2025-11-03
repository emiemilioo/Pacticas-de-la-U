/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package espol.poo.monitoreo2e;
import espol.poo.monitoreo2e.modelo.ConfiguracionInvalidaException;
import java.util.ArrayList;
import espol.poo.monitoreo2e.modelo.Sensor;

/**
 *
 * @author Gladys
 */
public class Monitoreo2E {
    public static ArrayList<Sensor> sensores;
    public static void main(String[] args) throws ConfiguracionInvalidaException {
       //completar de acuerdo a las instrucciones
        try{
            sensores = Sensor.cargarSensores();
            simularLecturas();
        }catch(ConfiguracionInvalidaException ex){
            ex.getMessage();
        }
       
    }
    
    
    
    public static void simularLecturas(){
        for(Sensor s:sensores){
            
                Thread hilo = new Thread(s);
                hilo.start();
            
            
        }
    }
}
