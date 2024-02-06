package POO6;

import javax.swing.JOptionPane;

public class CalculadoraImpuestos {
	private final double porcentajeimpuesto=0.15;
    private double precioProducto;
 
 
	public void CalculadoraImpuestos(double porcentajes) {
       
    }
 
   
    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }
 
  
    public double getPrecioProducto() {
        return precioProducto;
    }
 
   
    public double getPorcentajeImpuesto() {
        return porcentajeimpuesto;
    }
 
 
	public double getPorcentajeimpuesto() {
		return porcentajeimpuesto;
	}
	public void calcularImpuestos() {
        double impuesto = precioProducto * porcentajeimpuesto;
        double precioFinal = precioProducto + impuesto;
        JOptionPane.showMessageDialog(null, "Precio del producto: $" + precioProducto +
                "\nImpuesto (" + (porcentajeimpuesto * 100) + "%): $" + impuesto +
                "\nPrecio final: $" + precioFinal);
    }

}
