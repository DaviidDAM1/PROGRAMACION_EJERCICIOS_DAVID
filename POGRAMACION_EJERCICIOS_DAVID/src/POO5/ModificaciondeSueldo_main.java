package POO5;

public class ModificaciondeSueldo_main {

	public static void main(String[] args) {
		ModificaciondeSueldo empleado2 = new ModificaciondeSueldo ("David", 3000);
		String nombreempelado2 = empleado2.getNombre();
		double sueldoempleado2 = empleado2.getSueldo();
		
		empleado2.subeSueldo(10);
		double nuevoSueldoEmpleado2 = empleado2.getSueldo();
		System.out.println("Nuevo Sueldo de " + empleado2.getNombre() + ": " + nuevoSueldoEmpleado2);
		

	}

}
