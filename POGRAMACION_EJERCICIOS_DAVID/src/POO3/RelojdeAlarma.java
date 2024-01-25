package POO3;

import java.util.Scanner;

public class RelojdeAlarma {
	private String horaalarma;
    private String horaactual;
    private boolean alarmaactivada;
    
    public RelojdeAlarma(){
        Scanner scanner = new Scanner(System.in);
 
        
        System.out.print("Introduce la hora de alarma (formato HH:mm): ");
        String nuevaHoraAlarma = scanner.next();
        this.horaalarma = nuevaHoraAlarma;
 
        
        System.out.print("Introduce la hora actual (formato HH:mm): ");
        String nuevaHoraActual = scanner.next();
        this.horaactual = nuevaHoraActual;
 
        
        this.alarmaactivada = true;
 
        
        scanner.close();
    }
    
    public String gethoraalarmaa() {
        return horaalarma;
    }
 
    public String getHoraActual() {
        return horaactual;
    }
 
    public boolean isalarmaactivadaXD() {
        return alarmaactivada;
    }
 
    public void sethoraalarmaa(String nuevaHoraAlarma) {
        this.horaalarma = nuevaHoraAlarma;
    }
 
    public void sethoraactualll(String nuevaHoraActual) {
        this.horaactual = nuevaHoraActual;
    }
 
    public void setalarmaactivada(boolean alarmaActivada) {
        this.alarmaactivada = alarmaActivada;
    }
 
    public void comprobarAlarma() {
        if (horaactual.equals(horaalarma) && alarmaactivada) {
            System.out.println("Levantateee jodeer");
        } else {
            System.out.println("Puedes seguir durmiendo");
        }
    }
}
