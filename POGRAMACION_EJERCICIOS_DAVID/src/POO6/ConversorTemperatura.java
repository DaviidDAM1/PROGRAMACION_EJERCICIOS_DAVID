package POO6;

import javax.swing.JOptionPane;

public class ConversorTemperatura {
  private final double we = 1.8;
  private final double wo = 32;

	   
	    public double convertirCelsiusAFahrenheit(double temperaturaCelsius) {
	        return temperaturaCelsius * we + wo;
	    }

	    public static void main(String[] args) {
	    
	        ConversorTemperatura conversor = new ConversorTemperatura();

	        String input = JOptionPane.showInputDialog("Ingrese la temperatura en Celsius:");
	
	        double temperaturaCelsius = Double.parseDouble(input);
	
	        double temperaturaFahrenheit = conversor.convertirCelsiusAFahrenheit(temperaturaCelsius);

	        JOptionPane.showMessageDialog(null, "Temperatura en Celsius: " + temperaturaCelsius + "\nTemperatura en Fahrenheit: " + temperaturaFahrenheit);
	    }
	}
