import java.util.Scanner;

public class SimpleAgenda {
    private static String[] contactos = new String[10];

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

        // Remover el contacto si existe
        if (encontrado) {
            contactos[indice] = null;
            System.out.println("El contacto " + contacto + " fue removido exitosamente!");
        } else {
            System.out.println("No existe tal contacto: " + contacto);
        }
    }
    
    public static String actualizarContacto (int a) {

        return "N/A";
    }


    public static void mostrarContactos() {
        System.out.println("Mostrando contactos: ");
        for (String contacto : contactos) {
            if (contacto != null) {
                System.out.println(contacto);
            }
        }
    }

    public static void main(String[] args) {

    }
}