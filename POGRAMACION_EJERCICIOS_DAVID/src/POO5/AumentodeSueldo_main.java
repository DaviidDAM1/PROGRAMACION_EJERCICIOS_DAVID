package POO5;

import java.time.LocalDate;
import java.util.ArrayList;

public class AumentodeSueldo_main {

	public static void main(String[] args) {
		ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(new Empleado("Juan", 3000.0, LocalDate.of(2020, 5, 15)));
        listaEmpleados.add(new Empleado("María", 3500.0, LocalDate.of(2022, 3, 10)));
        listaEmpleados.add(new Empleado("Carlos", 4000.0, LocalDate.of(2019, 8, 22)));
        for (Empleado empleado : listaEmpleados) {
            if (empleado.getFechacontrato().getYear() < 2021) {
               empleado.setSueldo(5);
            }
        }
        for (Empleado empleado : listaEmpleados) {
            System.out.println("Nombre: " + empleado.getNombre() + ", Sueldo: " + empleado.getSueldo());
        }
    }

	}


