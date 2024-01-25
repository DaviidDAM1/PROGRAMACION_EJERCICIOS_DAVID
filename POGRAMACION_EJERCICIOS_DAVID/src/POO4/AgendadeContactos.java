package POO4;

public class AgendadeContactos {
	private String nombre;
	private int numerodetelefono;
	private String email;

	public AgendadeContactos(String nombre, int numerodetelefono, String email) {
		this.email= email;
		this.nombre= nombre;
		this.numerodetelefono= numerodetelefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumerodetelefono() {
		return numerodetelefono;
	}

	public void setNumerodetelefono(int numerodetelefono) {
		this.numerodetelefono = numerodetelefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	}

