package POOABSTRACT;

public class Animal_main {

	public static void main(String[] args) {
		Animales perro = new Perro();
        Animales gato = new Gato();

        perro.hacerSonido();
        perro.moverse();

        System.out.println();
        
        gato.hacerSonido();
        gato.moverse();
	}

}