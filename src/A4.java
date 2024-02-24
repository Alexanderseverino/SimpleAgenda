public class A4 {
    public static void main(String[] args) {

        for (int i = 1; i <= 2500; i++) {
            System.out.println(i);
        }

        for (int i = 5; i <= 950; i += 5) {
            System.out.println(i);
        }

        for (int i = 1; i <= 100; i += 3) {
            System.out.println(i);
        }

        for (int i = 800; i >= 0; i -= 2) {
            System.out.println(i);
        }

        for (int i = 1; i <= 300; i++) {
            System.out.println(i);
            if (i == 150) {
                System.out.println("Mitad del proceso");
            }
        }

        for (int i = 1; i <= 500; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            } else {
                System.out.println("No aplica este valor");
            }
        }
        
    }
}
