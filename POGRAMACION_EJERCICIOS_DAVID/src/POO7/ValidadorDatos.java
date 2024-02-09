package POO7;

public class ValidadorDatos {
	public static boolean esNumero(String cadena) {
        try {
            Double.parseDouble(cadena);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static boolean estaEnRango(double numero, double min, double max) {
        return numero >= min && numero <= max;
    }
}

