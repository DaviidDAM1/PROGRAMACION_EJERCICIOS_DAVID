package POO6;

import javax.swing.JOptionPane;

public class Votar {
    private String nombre;
    private final int edad=20;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void edadVotar() {
        if (edad < 18) {
            JOptionPane.showMessageDialog(null, "No tienes edad para votar");
        } else
			JOptionPane.showMessageDialog(null, "Tienes edad para votar");
    }
}

