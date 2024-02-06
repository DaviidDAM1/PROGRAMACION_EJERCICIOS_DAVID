package POO6;

import javax.swing.JOptionPane;

public class CalculadoraDescuentos_main {

	public static void main(String[] args) {
		CalculadoraDescuentos calculadora =new CalculadoraDescuentos();
		double precioproducto = Double.parseDouble(JOptionPane.showInputDialog("introduce el precio del producto"));
		int cantidadproducto = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de productos"));
		double porcentaje = Double.parseDouble(JOptionPane.showInputDialog("introduce el descuento del producto"));
		
     calculadora.CalcularDescuento();
     JOptionPane.showInputDialog("el resultado es de" + );
	}

}