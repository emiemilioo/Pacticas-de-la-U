import java.util.Scanner;
import java.util.ArrayList;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Mascotas preexistentes en el refugio
        lstMascotas.add(new Mascota("Toby", 3));
        lstMascotas.add(new Mascota("Luna", 2));
        lstMascotas.add(new Mascota("Max", 1));

        // 3.1 Solicita id y nombre de la persona
        System.out.print("Ingrese el ID de la persona: ");
        String id = sc.nextLine();
        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = sc.nextLine();

        // 3.2 Crea Persona y la añade a lstDuenos
        Persona p = new Persona(id, nombre);
        lstDuenos.add(p);

        // 3.3 Solicita nombre de la mascota
        System.out.print("Ingrese el nombre de la mascota a adoptar: ");
        String nombreMascota = sc.nextLine();

        // 3.4 Busca la mascota
        Mascota encontrada = buscarMascota(nombreMascota);

        // 3.5 Si existe, la persona la adopta
        if (encontrada != null) {
            p.adoptar(encontrada);

            // 3.6 Se elimina de lstMascotas
            lstMascotas.remove(encontrada);
        } else {
            System.out.println("Mascota no encontrada.");
        }

        // 3.7 Imprimir las listas
        System.out.println("\n--- Lista de Dueños ---");
        for (Persona persona : lstDuenos) {
            System.out.println(persona);
        }

        System.out.println("\n--- Mascotas disponibles ---");
        for (Mascota mascota : lstMascotas) {
            System.out.println(mascota);
        }

        sc.close();
    }

    // 2. Método para buscar mascota por nombre
    public static Mascota buscarMascota(String nombre) {
        for (Mascota m : lstMascotas) {
            if (m.getNombre().equalsIgnoreCase(nombre)) {
                return m;
            }
        }
        return null;
    }

