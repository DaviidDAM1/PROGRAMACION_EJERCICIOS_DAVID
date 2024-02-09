package POO7;

public class ValidadorDatos_main {

	public static void main(String[] args) {
		 String cadena1 = "123";
	        String cadena2 = "abc";
	        double numero1 = 5.5;
	        double numero2 = 20;

	        System.out.println(cadena1 + " es un número: " + ValidadorDatos.esNumero(cadena1));
	        System.out.println(cadena2 + " es un número: " + ValidadorDatos.esNumero(cadena2));

	        System.out.println(numero1 + " está en el rango (0, 10): " + ValidadorDatos.estaEnRango(numero1, 0, 10));
	        System.out.println(numero2 + " está en el rango (0, 10): " + ValidadorDatos.estaEnRango(numero2, 0, 10));
	    }
	}

	


