package POOherencia;

public class Figura_main {

	public static void main(String[] args) {
		Figura[] figuras = new Figura[2];
        figuras[0] = new Circulo(5); 
        figuras[1] = new Rectangulo(4, 6); 

        for (Figura figura : figuras) {
            System.out.println("Área de la figura: " + figura.calcularArea());
        }
    }
}

	


