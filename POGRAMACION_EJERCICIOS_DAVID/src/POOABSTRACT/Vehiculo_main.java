package POOABSTRACT;

public class Vehiculo_main {

	public static void main(String[] args) {
		Vehiculo automovil = new Automovil();
        Vehiculo motocicleta = new Motocicleta();

        automovil.acelerar();
        automovil.frenar();

System.out.println();
        
        motocicleta.acelerar();
        motocicleta.frenar();
}

	}


