package POO5;

public class ListadeEmpleados {
	private String nombre;
    private double sueldo;
    public ListadeEmpleados(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    public String dameNombre() {
        return nombre;
    }

    public double dameSueldo() {
        return sueldo;
    }
}

