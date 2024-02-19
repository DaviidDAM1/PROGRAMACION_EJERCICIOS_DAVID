package POOherencia;

public class vehiculo_main {

	public static void main(String[] args) {
		 Automovil miAuto = new Automovil("Toyota", "Corolla", 2022, "Gasolina");

	        System.out.println("Marca: " + miAuto.getMarca());
	        System.out.println("Modelo: " + miAuto.getModelo());
	        System.out.println("Año: " + miAuto.getAño());
	        System.out.println("Tipo de combustible: " + miAuto.getTipoDeCombustible());
	    }
	
	}


