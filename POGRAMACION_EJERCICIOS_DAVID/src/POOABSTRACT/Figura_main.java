package POOABSTRACT;

import javax.swing.JOptionPane;

public class Figura_main {

	public static void main(String[] args) {
		double baseRectangulo = Double.parseDouble(JOptionPane.showInputDialog("Introduce la base del rectángulo:"));
        double alturaRectangulo = Double.parseDouble(JOptionPane.showInputDialog("Introduce la altura del rectángulo:"));

        Rectangulo rectangulo = new Rectangulo(baseRectangulo, alturaRectangulo);

        JOptionPane.showMessageDialog(null, "El área del rectángulo es: " + rectangulo.calculararea());

        
        double radioCirculo = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio del círculo:"));

        
        Circulo circulo = new Circulo(radioCirculo);

        
        JOptionPane.showMessageDialog(null, "El área del círculo es: " + circulo.calculararea());
		
	
	
	}

}

	


