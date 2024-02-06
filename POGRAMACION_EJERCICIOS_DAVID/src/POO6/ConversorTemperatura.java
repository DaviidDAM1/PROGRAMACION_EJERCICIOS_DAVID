package POO6;

import javax.swing.JOptionPane;

public class ConversorTemperatura {
private final double temperatura=1.8;
private final int ajuste=32;
private double grados;
public void setgrados(double setgrados, double grados ) {
	this.grados = grados;
}

public double getTemperatura() {
	return temperatura;
}


public int getAjuste() {
	return ajuste;
}



public void conversortemperatura() {
double Fahrenheitcon = grados * temperatura;
double Fahrenheitaj = grados * ajuste;
JOptionPane.showInputDialog(null, "grados iniciales: °" + grados +
		"/y el ajuste y la conversion en Fahrenheit es de: " +Fahrenheitcon ,"y" + Fahrenheitaj);
}
}
	
