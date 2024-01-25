package POO4;

import javax.swing.JOptionPane;


public class CalculadoradeSalario_main {

	public static void main(String[] args) {
		CalculadoradeSalario[] empleados = new CalculadoradeSalario[5];
		 
        for (int i = 0; i < 5; i++) {

            String nombre = JOptionPane.showInputDialog("Ingresa el nombre del empleado " + (i + 1));

            double horasT = Double.parseDouble(JOptionPane.showInputDialog("Ingrese las horas trabajadas por " + nombre));

            double tarifaxhora = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la tarifa x hora de " + nombre));

            CalculadoradeSalario empleado = new CalculadoradeSalario();

            empleado.setNombre(nombre);

            empleado.setHoras(horasT);

            empleado.setTarifaxhora(tarifaxhora);

            empleados[i] = empleado;

        }
        for (CalculadoradeSalario empleado : empleados) {

            empleado.mostrarinfo();

        }

    }

}


