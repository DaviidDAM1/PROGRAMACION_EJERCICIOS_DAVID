package POO2;

public class Producto {
	private String nombre;
	private double precio;
	private int stock;

	public Producto () {

	nombre = "balon";
	precio = 6.25;
	stock = 543;
	}
	public String getnombre() {
		return nombre;
	}
	public double precio() {
		return precio;
	}
	public int stock() {
		return stock;
	}
	public void setnombre(String nombre) {
		this.nombre= nombre;
	}
	public void setprecio(double precio) {
		this.precio= precio;
	}
	public void setStock(int nuevoStock) {
	    if (nuevoStock >= 0) {
	        this.stock = nuevoStock;
	    } else {
	        System.out.println("Error: El stock no puede ser un número negativo. ");
	}
	}
}
