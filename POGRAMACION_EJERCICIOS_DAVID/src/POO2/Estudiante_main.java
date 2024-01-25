package POO2;


public class Estudiante_main {

	public static void main(String[] args) {
		Estudiante david= new Estudiante();
		david.setnombre(david.getnombre());
		david.setcalificacion(david.getcalificacion());
		david.setEdad(david.getedad());
	System.out.println("El estudiante se llama " + david.getnombre());
	System.out.println("David ha sacado un " + david.getcalificacion());
	System.out.println("y tiene " + david.getedad());

	}

	}


