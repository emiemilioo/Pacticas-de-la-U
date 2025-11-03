package espol.poo;

import espol.poo.modelo.Equipo;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.io.*;
class Main {
  public static String RUTA_EQUIPOS = "src/archivos/equipos.csv";
  public static String RUTA_REGISTROS = "src/archivos/registroalquiler.csv";
  
  
  public static void main(String[] args) {
    pruebaAlquiler();
  }
  
  
  
  public static void pruebaAlquiler(){
        ArrayList<Equipo> equipos = null;
        Scanner sc = new Scanner(System.in);
        //prueba de alquiler de equipos
        System.out.println("Prueba de alquiler");
        //TODO: llamar al metodo cargarEquipos, almacene la lista en la variable equipos definida en esta funcion
        equipos=Equipo.cargarEquipos(RUTA_EQUIPOS);
        //TODO: ordenar la lista
        if (equipos == null) {
            System.out.println("⚠️ No se cargaron los equipos. ¿Archivo no encontrado?");
            return;
        }

        if (equipos.isEmpty()) {
            System.out.println("⚠️ La lista de equipos está vacía. Verifica el archivo.");
            return;
        }

        Collections.sort(equipos);

        //TODO: presenta los equipos, usar for para presentar cada equipo con un print - puede crear un método para esto
        for(Equipo e:equipos){
            System.out.println(e);
        }

        //pedir el ingreso del codigo del equipo a alquilar hasta que escriba N
        String respuesta = "S";

        while (!respuesta.toUpperCase().equals("N")){
        //se mantendra solicitando el codigo de un equipo
        //mientras no encuentre uno en la lista
        //objBusqueda me servira para buscar en la lista y luego para almacenar el objeto real
        Equipo objBusqueda = null;
        String idConsulta = "";
        do {

            System.out.println("Ingrese codigo del equipo:");
            idConsulta = sc.nextLine();
            objBusqueda = new Equipo(idConsulta);
          //el metodo contains funciona porque la clase Equipo 
          //tiene el metodo equals que verifica el codigo
        } while (!equipos.contains(objBusqueda));

        //aqui ya el codigo existe en la lista por lo que podemos recuperar el objeto real
        int ind = equipos.indexOf(objBusqueda); //indice del objeto real
        
        //usar el indice para recuperar el equipo
        objBusqueda = equipos.get(ind);
        System.out.println("Equipo encontrado:");
        System.out.println(objBusqueda);
        
        String codigoObjBusqueda = objBusqueda.getCodigo();
        if(Equipo.consultarCantidadPrestamos(codigoObjBusqueda, RUTA_REGISTROS)<objBusqueda.getStock()){
            System.out.print("Ingrese cantidad de dias a alquilar: ");
            int dias = sc.nextInt();
            sc.nextLine();
            objBusqueda.asegurar(dias);
            System.out.println("El valor a pagar por el alquiler: " + objBusqueda.calcularValorAlquiler(dias));
        }else{
            System.out.println("Ya no hay equipos disponibles para alquilar");

        }
        
        //TODO: escribir el codigo para realizar lo indicado en los comentarios - puede realizar esto en otro método
        //verificar que exista stock para poder alquilar equipo
        //utilice la funcion consultarCantidadPrestamos
        //debe verificar que los prestamos registrados para ese equipo sea menor al stock


        //si hay stock para prestar el equipo:
            //solicite la cantidad de dias a alquiler y llame al metodo calcularValorAlquiler

            //llamar al metodo asegurar

            //escribir en el archivo de registros el nuevo alquiler usando la funcion  registrarAlquiler

            //mostrar la cantidad a pagar de alquiler
            
         //si no hay stock entonces muestra el mensaje

           //System.out.println("Ya no hay equipos disponibles para alquilar");

        //luego de procesar ese equipo pregunta si desea continuar consultando
        System.out.print("Dese seguir consultando S/N ? : ");
        respuesta= sc.nextLine();

        }
    }


    public static void registrarAlquiler(String codEquipo, int dias){
      //TODO: escribir en el archivo de registro el nuevo alquiler
      //cada linea en archivo tiene codigo y numero de dias
      File archivo = new File(RUTA_REGISTROS);
      
      try(PrintWriter salida = new PrintWriter(new FileWriter(archivo, true))){
          salida.println(codEquipo+", "+dias);
      }catch(FileNotFoundException ex){
          ex.printStackTrace(System.out);
      }catch(IOException ex){
          ex.printStackTrace(System.out);
      }
      
     
        
    }
}