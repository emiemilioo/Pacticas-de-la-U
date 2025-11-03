package espol.poo;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import espol.poo.modelo.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Path;
import espol.poo.modelo.Publicacion;
import espol.poo.modelo.PublicacionMultimedia;

public class Main {
    public static ArrayList<Publicacion> publicaciones;
    public static void main(String[] args) {
        publicaciones = new ArrayList<>();

        
        //objetos publicación
        publicaciones.add(new Publicacion(1, "Texto de prueba 1", 10, 50));
        publicaciones.add(new Publicacion(2, "Anuncio importante", 25, 200));
        publicaciones.add(new Publicacion(3, "Noticia del día", 15, 75));
        publicaciones.add(new Publicacion(4, "Pensamiento random", 5, 30));
        publicaciones.add(new Publicacion(5, "Actualización semanal", 20, 80));

        //objetos multimedia
        publicaciones.add(new PublicacionMultimedia(6, "Foto del evento", 30, 150, "http://example.com/foto.jpg", 0, TipoRecurso.IMAGEN));
        publicaciones.add(new PublicacionMultimedia(7, "Video tutorial", 45, 200, "http://example.com/video.mp4", 120, TipoRecurso.VIDEO));
        publicaciones.add(new PublicacionMultimedia(8, "Podcast episodio 1", 35, 180, "http://example.com/audio.mp3", 1800, TipoRecurso.AUDIO));
        publicaciones.add(new PublicacionMultimedia(9, "Galería de imágenes", 28, 140, "http://example.com/galeria.jpg", 0, TipoRecurso.IMAGEN));
        publicaciones.add(new PublicacionMultimedia(10, "Stream en vivo", 50, 250, "http://example.com/stream.mp4", 3600, TipoRecurso.VIDEO));
        analizarPublicaciones();
        crearPublicaciones();
    }


    public static void analizarPublicaciones(){
        
        //completar de acuerdo a las instrucciones
       
        Collections.sort(publicaciones);
        int cont=0;
        
            
            
            
                File archivo =  new File("top_publicaciones.txt");
          
                try(PrintWriter salida = new PrintWriter (archivo)){
                    for(Publicacion pub:publicaciones){
                        if(cont>=5) break ;

                        if(pub instanceof PublicacionMultimedia){
                            PublicacionMultimedia pubM = (PublicacionMultimedia) pub;
                            salida.println(pub.getId() + "," + pub.getContenido() + "," + pub.calcularPopularidad() +  "," + 
                            ((PublicacionMultimedia) pub).getUrlRecurso());
                        }else{
                            salida.println(pub.getId() + "," + pub.getContenido() + "," + pub.calcularPopularidad());
                        }
                        cont++;
                        System.out.println("Entrada numero " + cont + " guardada con exito :D");
                    }
                }catch(FileNotFoundException ex){
                    System.err.println(ex);

                }catch(Exception ex){
                    System.err.println(ex);
                }

            
        
    }


    public static void crearPublicaciones(){
         //completar de acuerdo a las instrucciones
        
        String salida="";
        Scanner sc= new Scanner(System.in);
        while(!salida.equalsIgnoreCase("N")){
            
            System.out.println("Ingrese ID: ") ;   
            int ID= sc.nextInt();
            sc.nextLine();

            System.out.println("Ingrese contenido: ") ;   
            String contenido= sc.nextLine();

            publicaciones.add(new Publicacion(ID,contenido,0,0));
            
            System.out.println("Desea continuar S/N? ") ; 
            salida= sc.nextLine();
            
            System.out.println(publicaciones);
        }

    }
}