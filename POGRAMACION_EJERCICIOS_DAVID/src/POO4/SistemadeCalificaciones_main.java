package POO4;

import javax.swing.JOptionPane;

public class SistemadeCalificaciones_main {

	public static void main(String[] args) {
		SistemadeCalificaciones curso = new SistemadeCalificaciones();
        String nombreCurso = JOptionPane.showInputDialog(null, "Ingrese el nombre del curso:");
        curso.setNombreCurso(nombreCurso);
        String calificacionStr = JOptionPane.showInputDialog(null, "Ingrese la calificación del curso:");
        try {
            double calificacion = Double.parseDouble(calificacionStr);
            curso.setCalificacion(calificacion);
            String categoria = curso.categorizarCalificacion();
            JOptionPane.showMessageDialog(null, "Categoría de calificación en " + curso.getNombreCurso() + ": " + categoria);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Ingrese una calificación válida.");
        }
    }
}