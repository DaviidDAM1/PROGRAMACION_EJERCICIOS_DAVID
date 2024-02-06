package POO6;

import javax.swing.JOptionPane;

public class Votar_main {

	public static void main(String[] args) {
		String nombre1 = JOptionPane.showInputDialog("Ingresa el nombre del votante 1 ") ;
        String nombre2 = JOptionPane.showInputDialog("Ingresa el nombre del votante 2 ") ;
        String nombre3 = JOptionPane.showInputDialog("Ingresa el nombre del votante 3 ") ;
 
        JOptionPane.showMessageDialog(null,"Los votantes son " + nombre1 +
        		" / " + nombre2 + " / " + nombre3);
        int edad1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad de "+ nombre1)) ;
        int edad2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad de "+ nombre2)) ;
        int edad3 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad de "+ nombre3)) ;
 
        Votar Usuario1 = new Votar(edad1);
        Votar Usuario2 = new Votar(edad2);
        Votar Usuario3 = new Votar(edad3);
        System.out.println(nombre1);
        System.out.println(Usuario1.ComprobarEdad());
        System.out.println(nombre2);
        System.out.println(Usuario2.ComprobarEdad());
        System.out.println(nombre3);
        System.out.println(Usuario3.ComprobarEdad());
	}
 
}
