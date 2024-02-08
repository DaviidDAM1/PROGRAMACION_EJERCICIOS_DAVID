package POO6;

import javax.swing.JOptionPane;

public class AñoBisiesto_main {

	public static void main(String[] args) {
		AñoBisiesto determinador = new AñoBisiesto();

	      
        String input = JOptionPane.showInputDialog("Ingrese un año:");
        
 
        int anio = Integer.parseInt(input);
        
   
        boolean esBisiesto = determinador.esBisiesto(anio);
        
       
        if (esBisiesto) {
            JOptionPane.showMessageDialog(null, "El año " + anio + " es un año bisiesto.");
        } else {
            JOptionPane.showMessageDialog(null, "El año " + anio + " no es un año bisiesto.");
        }
    }
}


	


