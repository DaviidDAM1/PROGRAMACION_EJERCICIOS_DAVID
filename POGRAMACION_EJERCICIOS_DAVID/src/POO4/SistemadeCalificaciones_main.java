package POO4;

import javax.swing.JOptionPane;

public class SistemadeCalificaciones_main {

	public static void main(String[] args) {
		SistemadeCalificaciones notas = new SistemadeCalificaciones();
		
		String curso = JOptionPane.showInputDialog("Ingresa el curso del estudiante");
        double calificacion = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la calificación para el curso " + curso));
      
        int calificacionRedondeada = (int) Math.round(calificacion);
      
        switch (calificacionRedondeada) {
            case 1:
                System.out.println("Tu calificación es A, ¡enhorabuena!");
                break;
            case 2:
                System.out.println("Tu calificación es B, ¡sigue así!");
                break;
            case 3:
                System.out.println("Tu calificación es C, no está mal");
                break;
            case 4:
                System.out.println("Tu calificación es D, esfuérzate más");
                break;
            case 5:
                System.out.println("Tu calificación es F, esfuérzate más");
                break;
            default:
                System.out.println("Calificación no válida");
        }
	}
	}


