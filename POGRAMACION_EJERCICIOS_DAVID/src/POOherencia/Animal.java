package POOherencia;

public class Animal {
	public void emitirSonido() {
        System.out.println("Que sonido hace el perroo?");
    }
}
class Perro extends Animal {
    public void emitirSonido() {
        System.out.println("guau guau xd");
    }
}


