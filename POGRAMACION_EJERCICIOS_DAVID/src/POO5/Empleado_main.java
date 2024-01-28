package POO5;

import java.util.Date;

public class Empleado_main {

	public static void main(String[] args) {
Empleado empleado1 = new Empleado("David", 3000.0, 2022, 1, 1);

        
        String nombreEmpleado1 = empleado1.getNombre();
        double sueldoEmpleado1 = empleado1.getSueldo();
        Date fechacontratoEmpleado1 = empleado1.getFechacontrato();

       
        System.out.println("Nombre: " + nombreEmpleado1);
        System.out.println("Sueldo: " + sueldoEmpleado1 +  "$");
        System.out.println("Fecha de Contrato: " + fechacontratoEmpleado1);
    }

	}

	


