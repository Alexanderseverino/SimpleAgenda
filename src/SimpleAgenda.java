import java.util.Scanner;

public class SimpleAgenda {
        public static void agregarContacto () {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese un contacto a agregar");

            String contacto = scanner.nextLine();

            if (contacto.length() > 4 && contacto.length() < 8) {

                System.out.println("Contacto agregado con éxito");

            } else if (contacto.length() >= 8 && contacto.length() <= 30) {

                System.out.println("Agregado, contiene entre 8-30 caracteres");

            } else {

                System.out.println("Nombre muy largo");
            }
        }


        public static void removerContacto (int id) {
            System.out.println(id + "");
        }

        public static String actualizarContacto (int a) {

            return "N/A";
        }

        public static void mostrarContactos (int b) {
        }

        public static void main(String[] args) {



        }

    }