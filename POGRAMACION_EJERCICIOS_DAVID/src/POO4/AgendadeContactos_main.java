package POO4;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class AgendadeContactos_main {

	public static void main(String[] args) {
			ArrayList<AgendadeContactos> listaContactos = new ArrayList<>();

	        while (true) {
	            String menu = "Menú de Contactos:\n" +
	                    "1. Añadir contacto\n" +
	                    "2. Buscar contacto\n" +
	                    "3. Mostrar contactos\n" +
	                    "4. Salir\n" +
	                    "Seleccione una opción:";

	            int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

	            switch (opcion) {
	                case 1:                   
	                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del contacto:");
	                    int numerodetelefono = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de teléfono:"));
	                    String email = JOptionPane.showInputDialog("Ingrese la dirección de email:");

	                    AgendadeContactos nuevoContacto = new AgendadeContactos(nombre, numerodetelefono, email);
	                    listaContactos.add(nuevoContacto);

	                    JOptionPane.showMessageDialog(null, "Contacto añadido exitosamente.");
	                    break;
	                case 2:
	                    String buscarNombre = JOptionPane.showInputDialog("Ingrese el nombre del contacto a buscar:");
	                    boolean encontrado = false;

	                    for (AgendadeContactos contacto : listaContactos) {
	                        if (contacto.getNombre().equalsIgnoreCase(buscarNombre)) {
	                            JOptionPane.showMessageDialog(null, "Contacto encontrado:\n" + contacto.toString());
	                            encontrado = true;
	                            break;
	                        }
	                    }
	                    if (!encontrado) {
	                        JOptionPane.showMessageDialog(null, "Contacto no encontrado.");
	                    }
	                    break;
	                case 3:
	                    StringBuilder resumenContactos = new StringBuilder("Lista de Contactos:\n");

	                    for (AgendadeContactos contacto : listaContactos) {
	                        resumenContactos.append(contacto.toString()).append("\n");
	                    }

	                    JOptionPane.showMessageDialog(null, resumenContactos.toString(), "Contactos", JOptionPane.INFORMATION_MESSAGE);
	                    break;
	                case 4:
	                    System.exit(0);
	                    break;
	                default:
	                    JOptionPane.showMessageDialog(null, "Opción inválida. Intente nuevamente.");
	            }

		}
		}
		

	

}
