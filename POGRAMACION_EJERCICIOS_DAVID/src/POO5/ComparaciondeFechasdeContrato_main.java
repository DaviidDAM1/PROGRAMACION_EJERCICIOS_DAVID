package POO5;

import java.util.Date;
import java.util.Scanner;

public class ComparaciondeFechasdeContrato_main {

	public static void main(String[] args) {
		Empleado empleado3 = crearEmpleadoConFechaContrato("Empleado3");
        Empleado empleado4 = crearEmpleadoConFechaContrato("Empleado4");
        compararFechasContrato(empleado3, empleado4);
    }
    public static Empleado crearEmpleadoConFechaContrato(String nombre) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el sueldo para " + nombre + ":");
        double sueldo = scanner.nextDouble();

        System.out.println("Ingrese el año de contrato para " + nombre + ":");
        int anio = scanner.nextInt();

        System.out.println("Ingrese el mes de contrato para " + nombre + ":");
        int mes = scanner.nextInt();

        System.out.println("Ingrese el día de contrato para " + nombre + ":");
        int dia = scanner.nextInt();

        return new Empleado(nombre, sueldo, anio, mes, dia);
    }
    public static void compararFechasContrato(Empleado empleado1, Empleado empleado2) {
        Date fechaContratoEmpleado1 = empleado1.getFechacontrato();
        Date fechaContratoEmpleado2 = empleado2.getFechacontrato();

        if (fechaContratoEmpleado1.before(fechaContratoEmpleado2)) {
            System.out.println(empleado1.getNombre() + " fue contratado antes que " + empleado2.getNombre());
        } else if (fechaContratoEmpleado1.after(fechaContratoEmpleado2)) {
            System.out.println(empleado2.getNombre() + " fue contratado antes que " + empleado1.getNombre());
        } else {
            System.out.println("Ambos fueron contratados en la misma fecha.");
        }
    }


	}


