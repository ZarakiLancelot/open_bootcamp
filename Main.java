public class Main {
    public static void main(String[] args) {
        suma(20, 30, 50);

        Coche miCoche = new Coche();
        miCoche.incrementar_numero_puertas(4);
        int puertas = miCoche.numero_puertas;
        System.out.println("Número de puertas: " + puertas);
    }

    public static int suma(int numero_uno, int numero_dos, int numero_tres) {
        return numero_uno + numero_dos + numero_tres;
    }
}