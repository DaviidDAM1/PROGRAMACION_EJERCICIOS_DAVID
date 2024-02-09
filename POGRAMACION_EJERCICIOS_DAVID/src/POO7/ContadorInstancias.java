package POO7;

public class ContadorInstancias {
	 private static int contadorInstancias = 0;
	    
	    public ContadorInstancias() {
	        contadorInstancias++;
	    }
	    public static int obtenerNumeroInstancias() {
	        return contadorInstancias;
	    }
}

