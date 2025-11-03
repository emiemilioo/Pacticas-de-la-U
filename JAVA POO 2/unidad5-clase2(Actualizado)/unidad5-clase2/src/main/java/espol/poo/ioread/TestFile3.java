/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espol.poo.ioread;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gladys
 */
public class TestFile3 {
    public static void main(String[] args) throws IOException{
   
       
        String path = "archivos/estudiantes.txt";
       // String path =  System.getProperty("java.class.path") + "/archivos/estudiantes.txt";
        System.out.println(path);
         try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
      
            String line="";
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                System.out.println("xxxx");
                
            }
           
 
        } catch (IOException e) {
            e.printStackTrace();
        }finally{

        }
    

    }
}
