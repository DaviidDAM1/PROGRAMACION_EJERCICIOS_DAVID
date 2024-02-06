package POO6;

public class CalculadoraDescuentos {
	private final double porcentaje = 0.10 ;
	private double precio;
	private int cantidades;

	public CalculadoraDescuentos(double precio, int cantidades) {
		this.precio = precio;
		this.cantidades = cantidades;
	}

	public double getPorcentaje() {
		return porcentaje;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String DescontarProducto() {
		double descuento = porcentaje * precio;
        double descuentoTotal = descuento * cantidades;
        double precioFinal = precio - descuentoTotal;
 
        return "El Descuento del Producto es " + descuento +
                "\nEl Descuento total para " + cantidades + " unidades es " + descuentoTotal +
                "\nEl Precio total con el descuento es " + precioFinal;
	}
	public int getCantidades() {
		return cantidades;
	}
	public void setCantidades(int cantidades) {
		this.cantidades = cantidades;
	}
}