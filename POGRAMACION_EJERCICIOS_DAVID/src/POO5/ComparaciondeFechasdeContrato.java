package POO5;

import java.time.LocalDate;

public class ComparaciondeFechasdeContrato {
	private String nombre;
    private double sueldo;
    private LocalDate fechaContrato;
    public ComparaciondeFechasdeContrato(String nombre, double sueldo, int anio, int mes, int dia) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.fechaContrato = LocalDate.of(anio, mes, dia);
    }
    public String dameNombre() {
        return nombre;
    }
    public double dameSueldo() {
        return sueldo;
    }
    public LocalDate getFechaContrato() {
        return fechaContrato;
    }
}


