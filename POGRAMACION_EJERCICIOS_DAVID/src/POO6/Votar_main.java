package POO6;

import javax.swing.JOptionPane;

public class Votar_main {

	public static void main(String[] args) {
		Votar votar = new Votar();
		
		String input = JOptionPane.showInputDialog("Ingrese la edad");
		int edad = Integer.parseInt(input);
		
		votar.edadVotar();
		
		
		
		
	}

}
