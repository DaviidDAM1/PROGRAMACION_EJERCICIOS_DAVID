package POO6;

public class CalculadoraDescuentos {
	private final double porcentaje = 10;
	private double precioproducto;
	private int cantidadproducto;


	public double getPrecioproducto() {
		return precioproducto;
	}

	public void setPrecioproducto(int precioproducto) {
		this.precioproducto = precioproducto;
	}
	
	public int getCantidadproducto() {
		return cantidadproducto;
	}

	public void setCantidadproducto(int cantidadproducto) {
		this.cantidadproducto = cantidadproducto;
	}

	public void CalcularDescuento() {
		double precioFinal = (cantidadproducto * precioproducto) /porcentaje;
		
	}
	
	
}
