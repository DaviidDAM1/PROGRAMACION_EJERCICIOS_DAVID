package POO6;

import javax.swing.JOptionPane;

public class CalculadoraImpuestos {
	 private final double tasa;

	    public CalculadoraImpuestos(double tasaImpuesto) {
	        this.tasa = tasaImpuesto;
	    }

	    public double calcularImpuesto(double precioProducto) {
	        return precioProducto * tasa;
	    }

	    public double calcularPrecioFinal(double precioProducto, double impuesto) {
	        return precioProducto + impuesto;
	    }
}