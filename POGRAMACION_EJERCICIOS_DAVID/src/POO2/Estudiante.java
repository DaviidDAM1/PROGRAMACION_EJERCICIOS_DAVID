package POO2;

public class Estudiante {
	private String nombre;
	private int edad;
	private double calificacion;

	public Estudiante() {

	nombre= "David";
	edad= 18;
	calificacion= 5.5;

	}
	public String getnombre() {
		return nombre;
	}
	public int getedad() {
		return edad;	
	}
	public double getcalificacion() {
		return calificacion;
	}
	public void setnombre(String nombre) {
		this.nombre=nombre;
	}
	public void setEdad(int edad) {
	    if (edad >= 0) {
	        this.edad = edad;
	    } else {
	        System.out.println("Error: La edad debe ser un número positivo.");
	    }
	}public void setcalificacion(double calificacion) {
		this.calificacion=calificacion;
	}
	}

