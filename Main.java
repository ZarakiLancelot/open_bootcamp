public class Main {
    public static void main(String[] args) {
        // suma(20, 30, 50);

        // Coche miCoche = new Coche();
        // miCoche.incrementar_numero_puertas(4);
        // int puertas = miCoche.numero_puertas;
        // System.out.println("Número de puertas: " + puertas);

        //* IF */
        // int numeroIf = -1;

        // if (numeroIf > 0) {
        //     System.out.println(numeroIf + " es un número positivo");
        // } else if (numeroIf < 0) {
        //     System.out.println(numeroIf + " es un número negativo");
        // } else {
        //     System.out.println(numeroIf + " es cero");
        // }

        // //* WHILE */
        // int numeroWhile = 0;

        // while (numeroWhile < 3) {
        //     numeroWhile++;
        //     System.out.println(numeroWhile);
        // }

        // //* DO WHILE */
        // do {
        //     numeroWhile++;
        //     System.out.println("En el DO WHILE: " + numeroWhile);
        // } while (numeroWhile == numeroWhile + 1);

        // //* FOR */
        // for (int numeroFor = 0; numeroFor < 3; numeroFor++) {
        //     System.out.println("FOR: " + numeroFor);
        // }

        // //* SWITCH */
        // String estacion = "OTOÑO";

        // switch (estacion) {
        //     case "VERANO":
        //         System.out.println("Estamos en " + estacion);
        //         break;
        //     case "INVIERNO":
        //         System.out.println("Estamos en " + estacion);
        //         break;
        //     case "OTOÑO":
        //         System.out.println("Estamos en " + estacion);
        //         break;
        //     case "PRIMAVERA":
        //         System.out.println("Estamos en " + estacion);
        //         break;
        //     default:
        //         System.out.println("NO es una estación!");
        //         break;
        // }

        Persona persona = new Persona();

        persona.setEdad(30);
        persona.setNombre("Allan");
        persona.setTelefono("5555-1234");

        System.out.println("El nombre de la persona es: " + persona.getNombre() + " tiene " + persona.getEdad() + " años de edad y su número de teléfono es: " + persona.getTelefono());
    }

    public static int suma(int numero_uno, int numero_dos, int numero_tres) {
        return numero_uno + numero_dos + numero_tres;
    }
}