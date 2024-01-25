package POO4;

public class Producto {
	private String producto;
	private int cantidad;
	private double precio;

	public Producto(String producto, int cantidad, double precio) {
		this.producto = producto;
	    this.cantidad = cantidad;
	    this.precio = precio;
		}


	public String getProdructo() {
		return producto;
	}

	public void setProdructo(String prodructo) {
		this.producto = prodructo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void mostrarInformacion() {
	    System.out.println("el nombre del producto es: " + this.producto);
	    System.out.println("el precio del producto es: " + this.precio  + "$");
	    System.out.println("la cantidad del producto es: " + this.cantidad);
	}

		
	}

