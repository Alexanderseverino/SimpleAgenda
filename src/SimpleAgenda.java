import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SimpleAgenda {
    private static String[] contactos = new String[10];

    public static void generarArchivo() {
        try {

            File archivo = new File("contactos.txt");

            archivo.createNewFile();

            FileWriter fw = new FileWriter(archivo);

            String contenido = "contacto,telefono\n" + "Adan,8098551212\n" + "Enmanuel,8294118787\n" + "Raider,8097410032\n" + "Roger,8095554141\n";

            fw.write(contenido);

            fw.close();

            System.out.println("Archivo 'contactos.txt' creado exitosamente!");

        } catch (IOException e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }
    }

    public static void agregarContacto() {

        Scanner AC = new Scanner(System.in);

        System.out.println("Ingrese un contacto a agregar: ");

        String contacto = AC.nextLine();

        boolean encontrado = false;
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] != null && contactos[i].equals(contacto)) {
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            for (int i = 0; i < contactos.length; i++) {
                if (contactos[i] == null) {
                    contactos[i] = contacto;
                    System.out.println("Contacto " + contacto + " agregado satisfactoriamente!");
                    break;
                }
            }
        } else {
            System.out.println("Ya se ha agregado anteriormente el contacto " + contacto);
        }
    }

    public static void removerContacto() {

        Scanner RC = new Scanner(System.in);

        System.out.println("Ingrese el nombre del contacto a remover: ");

        String contacto = RC.nextLine();


        boolean encontrado = false;

        int indice = -1;

        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] != null && contactos[i].equals(contacto)) {
                encontrado = true;
                indice = i;
                break;
            }
        }

        if (encontrado) {
            contactos[indice] = null;
            System.out.println("El contacto " + contacto + " fue removido exitosamente!");
        } else {
            System.out.println("No existe tal contacto: " + contacto);
        }
    }

    public static String actualizarContacto(int a) {

        return "N/A";
    }
    public static void mostrarContacto() {

        Scanner MC = new Scanner(System.in);

        System.out.println("Ingrese nombre a consultar: ");

        String nombreContacto = MC.nextLine();

        boolean encontrado = false;

        try {
            File archivo = new File("contactos.txt");
            Scanner lector = new Scanner(archivo);

            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                String[] datos = linea.split(",");

                if (datos[0].equals(nombreContacto)) {
                    encontrado = true;
                    System.out.println("El contacto " + nombreContacto + " existe " + datos[1]);
                    break;
                }
            }

            lector.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        if (!encontrado) {
            System.out.println("No existen registros de este contacto");
        }
    }

    public static void mostrarContactos() {
        System.out.println("Mostrando contactos: ");

        try {
            File archivo;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) {
        mostrarContactos();
    }
}