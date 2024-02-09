package POO7;

public class ContadorInstancias_main {

	public static void main(String[] args) {
		ContadorInstancias instancia1 = new ContadorInstancias();
        ContadorInstancias instancia2 = new ContadorInstancias();
        ContadorInstancias instancia3 = new ContadorInstancias();  
        System.out.println("Número de instancias creadas: " + ContadorInstancias.obtenerNumeroInstancias());
    }
}


	


