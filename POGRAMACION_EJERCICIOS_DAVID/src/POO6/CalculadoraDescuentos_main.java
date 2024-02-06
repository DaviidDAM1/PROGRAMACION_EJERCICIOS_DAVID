package POO6;

import javax.swing.JOptionPane;

public class CalculadoraDescuentos_main {

	public static void main(String[] args) {
		String Pan_Horneado = "Pan Horneado";
		String Pizza = "Pizza Doble Queso";
		JOptionPane.showMessageDialog(null, Pan_Horneado + " \n "+ Pizza);

		double precioProducto1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el precio del primer producto: "));
		int cantidades1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad del primer producto: "));
        double precioProducto2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el precio del segundo producto: "));
        int cantidades2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad del segundo producto: "));
        CalculadoraDescuentos CantidadProducto1 = new CalculadoraDescuentos(precioProducto1,cantidades1);
        CalculadoraDescuentos CantidadProducto2 = new CalculadoraDescuentos(precioProducto2,cantidades2);
        System.out.println(CantidadProducto1.DescontarProducto());
        System.out.println();
        System.out.println(CantidadProducto2.DescontarProducto());
 
 
  
	}
}