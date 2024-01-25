package POO4;

public class SistemadeCalificaciones {
	private String nombrecurso;
	private double calificacion;
	public SistemadeCalificaciones () {
	}


	public String getNombrecurso() {
		return nombrecurso;
	}

	public void setNombrecurso(String nombrecurso) {
		this.nombrecurso = nombrecurso;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

	public void mostrarinfo() {
		System.out.println(" el nombre del curso es " + this.getNombrecurso());
		System.out.println("La calificacion es " + this.getCalificacion() );
		

	}
	}

