package POO4;

import javax.swing.JOptionPane;

public class Producto_main {

	public static void main(String[] args) {
		Producto[] productos = new Producto[3];
		 
        for (int i = 0; i < productos.length; i++) {
            String producto = JOptionPane.showInputDialog("Ingresa el nombre del producto " + (i + 1));
            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad exacta " + (i + 1)));
            double precio = Double.parseDouble(JOptionPane.showInputDialog("Determina el precio del producto " + (i + 1)));
 
            
            Producto inventario = new Producto(producto, cantidad,precio);
            productos[i] = inventario;
        }
 
        for (Producto inventario : productos) {
            inventario.mostrarInformacion();
        }
	}
          
        }
	
	