package POO3;


public class RelojdeAlarma_main {

	public static void main(String[] args) {
		RelojdeAlarma miReloj = new RelojdeAlarma();
		 System.out.println("Hora de Alarma: " + miReloj.gethoraalarmaa());
	        System.out.println("Hora Actual: " + miReloj.getHoraActual());
	        System.out.println("Alarma Activada: " + miReloj.isalarmaactivadaXD());
	        miReloj.comprobarAlarma();
	    }
	


	}


