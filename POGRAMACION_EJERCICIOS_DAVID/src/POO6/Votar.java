package POO6;

public class Votar {
	private final int edadmin = 18;
	private int edad;
	public Votar(int edad) {
		this.edad = edad;
	}
	public String ComprobarEdad() {
		if (edad < edadmin) {
			return "No puedes votar, eres menor de edad. Lo siento";
		} else {
		return "Eres mayor de edad, ¡puedes votar! ";
		}
	}
	public int getEdadmin() {
		return edadmin;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
}


