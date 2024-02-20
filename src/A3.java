public class A3 {

    public static void main(String[] args) {

        //Declarar una variable de tipo String denominada articulo inicializada con un valor que represente el nombre de un artículo.

        String artivulo = "Pantalon";

        //Declarar una variable de tipo booleano llamada tienePermiso inicializada con el valor true.

        boolean tienePermiso = true;

        //Aplicar una condicional que valide si dicha variable no es verdadera. De ser así imprimir "No tiene permiso de acceso". De lo contrario, imprimir "Bienvenido".

        if (!tienePermiso) {
            System.out.println("No tiene permiso de acceso");
        } else {
            System.out.println("Bienvenido");
        }

//Declarar una variable de tipo int llamada cifra que almacene el valor 950.
        int cifra = 950;

        //Aplicar una condición que verifique si el valor de la variable cifra está entre 0-500, sin incluir valores negativos.Si es así, imprimir "Rango menor".

        if (cifra > 0 && cifra <= 500) {
            System.out.println("Rango menor");

            // De lo contrario si, la cifra está entre 501-2000, imprimir "Rango intermedio".

        } else if (cifra > 500 && cifra <= 2000) {
            System.out.println("Rango intermedio");

            //De lo contrario si el valor está por encima de 2000 y menor a 10000, imprimir "Rango superior".
        } else if (cifra > 2000 && cifra <= 10000) {
            System.out.println("Rango superior");

            //De lo contrario, imprimir "Rango inválido!".

        } else {
            System.out.println("Rango invalido!");
        }
//Declarar una variable de tipo String llamada respuesta, sin inicializar;

        String respuesta;

        //y otra de tipo int llamada n inicializada en 25.

        int n = 25;

        //Aplicar una condicional que verifique si el valor de n está por encima de 0 y menor a 100.

        if (n > 0 && n < 100) {

            //De ser así, asignar el valor de "SI" a la variable respuesta creada anteriormente.

            respuesta = "SI";

            // De lo contrario, asignarle el valor de "NO".
        } else {

            respuesta = "NO";
        }
// Crear una variable de tipo booleana llamada encendido con el valor de true.

        boolean encendido = true;

        //y otra variable de tipo int llamada cantidad.

        int cantidad = 20;

//Aplicar una condicional que verifique si el valor de encendido es verdadero. De ser así, aplicar otra condicional que verifique si cantidad es igual a 20. De ser así, imprimir "Correcto".

        if (encendido) {
            if (cantidad == 20) {
                System.out.println("Correcto");
            }

            //Si el valor de encendido no es verdadero, imprimir "Incorrecto".

        } else {
            System.out.println("Incorrecto");
        }
    }
}