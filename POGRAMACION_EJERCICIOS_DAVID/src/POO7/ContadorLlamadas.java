package POO7;

public class ContadorLlamadas {
	private static int contador = 0;

    public static void operacionSimple() {
        System.out.println("Realizando operación simple...");
        contador++;
    }
    public static int obtenerNumeroLlamadas() {
        return contador;
    }
}
