package POO6;

import javax.swing.JOptionPane;

class ConversorTemperatura_main {

	public static void main(String[] args) {
		ConversorTemperatura grados = new ConversorTemperatura();
		String input = JOptionPane.showInputDialog("Ingrese los grados");
		double grados1 = Double.parseDouble(input);
		
		grados.setgrados(grados1, grados1);
		
		grados.conversortemperatura();

	}

}
