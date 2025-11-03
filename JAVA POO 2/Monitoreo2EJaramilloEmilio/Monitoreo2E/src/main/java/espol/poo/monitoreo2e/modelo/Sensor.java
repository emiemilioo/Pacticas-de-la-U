package espol.poo.monitoreo2e.modelo;

import java.util.Random;
import java.util.ArrayList;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Sensor extends Dispositivo implements Runnable{
    private String tipo;
    private double valMin;
    private double valMax;
    private double valorActual;


    public Sensor(String id, String ubicacion, String tipo, double valMin, double valMax) throws ConfiguracionInvalidaException{
        super(id, ubicacion);
        //completar de acuerdo a las instrucciones
       
        
        /*try{
            this.valMin = valMin;
        }catch(ConfiguracionInvalidaException ex){
            ex.getMessage();
        }*/
        
        this.valMin = valMin;
        this.valMax = valMax;
        
        if(valMin>=valMax){
            throw new ConfiguracionInvalidaException("Error, no respeto los valores ");  
        }
        
        this.tipo = tipo;
        
        
    }

    //genera y duevuelve una lectura aleatoria
    //NO MODIFIQUE EL CÓDIGO DE ESTE MÉTODO
    public double simularLectura() {
        Random random = new Random();
        // Genera un valor entre (minTemp-10) y (maxTemp+10) para forzar lecturas fuera de rango
        return (valMin - 10) + random.nextDouble() * ((valMax + 10) - (valMin - 10));
    }

    // Verifica si la lectura está dentro de rango
    //NO MODIFIQUE EL CÓDIGO DE ESTE MÉTODO
    public boolean esLecturaCorrecta(double valor) {
        return valor >= valMin && valor <= valMax;
    }

    //completar de acuerdo a las instrucciones

    @Override
    public void calibrar() {
        
        Random random =new Random();
        double numeroAleatorio = valMin + (valMax - valMin)* random.nextDouble();
        this.valorActual=numeroAleatorio;
    }

    /*public static ArrayList<Sensor> cargarSensores() throws ConfiguracionInvalidaException {
        ArrayList<Sensor> sensores = new ArrayList<>();
        //Sensor s= new Sensor();
        File archivo = new File("C:\\Users\\lilia\\OneDrive\\Escritorio\\POO\\Monitoreo2EJaramilloEmilio\\Monitoreo2E\\sensores.txt");
        try(BufferedReader entrada= new BufferedReader (new FileReader(archivo))){
            
            entrada.readLine();
            String linea = entrada.readLine();
            
            while(linea!=null){
                
                String[] partes = linea.split(";");
                String id = partes[1].trim();
                String ub = partes[2].trim();
                String tipo = partes[0].trim();
                
                
                
                double valMin = Double.parseDouble(partes[3].trim());
                double valMax = Double.parseDouble(partes[4].trim());
                // se que el error esta aqui pero no pude solucionarlo :(
                
                if(valMin<=valMax){
                    Sensor s = new Sensor(id,ub,tipo,valMin,valMax);
                    sensores.add(s);
                }else{
                    throw new ConfiguracionInvalidaException("Error: Sensor " + partes[1] +": minTemp>=maxTemp");    
                }
                
                linea = entrada.readLine();
            }
            
            
            
            
        }catch(FileNotFoundException ex){
            System.err.print(ex);
        }catch(IOException ex){
            System.err.print(ex);
        }
            
        return sensores;
    }*/
    
    public static ArrayList<Sensor> cargarSensores() throws ConfiguracionInvalidaException {
        ArrayList<Sensor> sensores = new ArrayList<>();
        File archivo = new File("C:\\Users\\lilia\\OneDrive\\Escritorio\\POO\\Monitoreo2EJaramilloEmilio\\Monitoreo2E\\sensores.txt");

        if(!archivo.exists()){
            System.err.println("Archivo no encontrado: " + archivo.getAbsolutePath());
            return sensores; // lista vacía
        }

        try(BufferedReader entrada= new BufferedReader(new FileReader(archivo))){
            String linea = entrada.readLine(); // si hay encabezado, úsalo o ignóralo

            while(linea != null){
                try {
                    String[] partes = linea.split(";");
                    if(partes.length < 5){
                        System.err.println("Línea mal formateada: " + linea);
                        linea = entrada.readLine();
                        continue;
                    }

                    String tipo = partes[0].trim();
                    String id = partes[1].trim();
                    String ub = partes[2].trim();
                    double valMin = Double.parseDouble(partes[3].trim());
                    double valMax = Double.parseDouble(partes[4].trim());

                    if(valMin > valMax){
                        System.err.println("Error: min > max en sensor " + id);
                        linea = entrada.readLine();
                        continue;
                    }

                    sensores.add(new Sensor(id, ub, tipo, valMin, valMax));
                } catch(NumberFormatException ex){
                    System.err.println("Valor numérico inválido en línea: " + linea);
                } catch(ConfiguracionInvalidaException ex){
                    System.err.println("Error de configuración: " + ex.getMessage());
                }

                linea = entrada.readLine();
            }
        } catch(IOException ex){
            System.err.println("Error leyendo el archivo: " + ex.getMessage());
        }

        if(sensores.isEmpty()){
            System.err.println("No se cargó ningún sensor. Revisa el archivo.");
        }

        return sensores;
    }
    
    
    @Override
    public void run() {
        System.out.println("Simulando sensor: " + this.getId());
        //int lecturasValidas=0;
        int lecturasInvalidas=0;
        
        while(lecturasInvalidas<3){
            double numLectura = this.simularLectura();
            if(esLecturaCorrecta(numLectura)){
                System.out.println(this.getId() + " valor generado : " + numLectura + ": Valida");
                this.calibrar();
                lecturasInvalidas=0;
            }else{
                lecturasInvalidas++;
                System.out.println(this.getId() + " valor generado : " + numLectura + ": Invalida");
            }
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.getMessage();
                System.err.print(ex);
            }
        }
        
        
        System.out.println("Simulacion Terminada para " + this.getId());
    }
    


}
