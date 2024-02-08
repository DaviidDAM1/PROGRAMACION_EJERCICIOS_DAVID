package POO6;

public class AñoBisiesto {
	 private final int divisiblecuatro = 4;
	    private final int divisiblecien = 100;
	    private final int divisiblecuatrocientos = 400;

	    public boolean esBisiesto(int anio) {
	        return (anio % divisiblecuatro == 0 && anio % divisiblecien != 0) || (anio % divisiblecuatrocientos == 0);
	    }
}

