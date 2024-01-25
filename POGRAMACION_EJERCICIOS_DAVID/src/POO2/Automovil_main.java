package POO2;


public class Automovil_main {

	public static void main(String[] args) {
		Automovil david = new Automovil();
		david.setmarca(david.getmarca());
		david.settipo(david.gettipo());
		david.setpotencia(david.getpotencia());
		System.out.println("el automovil es de la marca " + david.getmarca());
		System.out.println("el automovil es del tipo " + david.gettipo());
		System.out.println("la potencia del automovil es " + david.getpotencia());

	}


	}


