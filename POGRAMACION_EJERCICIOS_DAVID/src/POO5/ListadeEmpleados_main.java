package POO5;

import java.util.ArrayList;
import java.util.List;

public class ListadeEmpleados_main {

	public static void main(String[] args) {
		List<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(new ListadeEmpleados("Juan", 3000.0));
        listaEmpleados.add(new ListadeEmpleados("María", 3500.0));
        listaEmpleados.add(new ListadeEmpleados("Carlos", 4000.0));
        for (Empleado empleado : listaEmpleados) {
            System.out.println("Nombre: " + empleado.getNombre() + ", Sueldo: " + empleado.getSueldo());
        }
    }

	}


