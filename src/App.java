public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        /* Ejercicio 1: if */
        int numeroIf = 10;

        if (numeroIf > 0) {
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es negativo");
        }

        /* Ejercicio 2: While */
        int numeroWhile = 0;

        while (numeroWhile < 3) {
            System.out.println("numeroWhile: " + numeroWhile);
            numeroWhile++;
        }

        /* Ejercicio 3: Do While */
        int numeroDoWhile = 0;

        do {
            System.out.println("numeroDoWhile: " + numeroDoWhile);
        } while (numeroDoWhile > 0);

        /* Ejercicio 4: For */

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("El numeroFor es: " + numeroFor);
        }

        /* Ejercicio 5: Switch */

        String estacion = "verano";

        switch (estacion) {
            case "verano":
                System.out.println("Estamos en verano!");
                break;
            case "invierno":
                System.out.println("Estamos en invierno!");
                break;
            case "primavera":
                System.out.println("Estamos en primavera!");
                break;
            case "otoño":
                System.out.println("Estamos en otoño!");
                break;
            default:
                System.out.println("La variable " + estacion + " no es una estacion.");
        }
    }
}
