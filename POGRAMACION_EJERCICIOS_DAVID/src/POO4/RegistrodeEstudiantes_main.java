package POO4;

import javax.swing.JOptionPane;

public class RegistrodeEstudiantes_main {

	public static void main(String[] args) {
		RegistrodeEstudiantes uno = new RegistrodeEstudiantes();
		RegistrodeEstudiantes dos = new RegistrodeEstudiantes();
		RegistrodeEstudiantes tres = new RegistrodeEstudiantes();
		
		uno.setnombre(JOptionPane.showInputDialog("Ingresa el nombre del estudiante 1:"));
        uno.setedad(Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad del estudiante 1:")));
        uno.setgrado(JOptionPane.showInputDialog("Ingresa el grado del estudiante 1:"));

        dos.setnombre(JOptionPane.showInputDialog("Ingresa el nombre del estudiante 2:"));
        dos.setedad(Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad del estudiante 2:")));
        dos.setgrado(JOptionPane.showInputDialog("Ingresa el grado del estudiante 3:"));
        
        tres.setnombre(JOptionPane.showInputDialog("Ingresa el nombre del estudiante 3:"));
        tres.setedad(Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad del estudiante 3:")));
        tres.setgrado(JOptionPane.showInputDialog("Ingresa el grado del estudiante 3:"));
        
        System.out.println("Información del Estudiante 1:");
        uno.mostrarInformacion();

        System.out.println("Información del Estudiante 2:");
        dos.mostrarInformacion();

        System.out.println("Información del Estudiante 3:");
        tres.mostrarInformacion();
	}


	}


