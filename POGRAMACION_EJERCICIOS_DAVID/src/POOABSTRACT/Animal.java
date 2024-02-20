package POOABSTRACT;

abstract class Animales {
    abstract void hacerSonido();
    abstract void moverse();
}

class Perro extends Animales {
    @Override
    void hacerSonido() {
        System.out.println("El perro ladra.");
    }

    @Override
    void moverse() {
        System.out.println("El perro corre.");
    }
}

class Gato extends Animales {
    @Override
    void hacerSonido() {
        System.out.println("El gato maúlla.");
    }

    @Override
    void moverse() {
        System.out.println("El gato camina sigilosamente.");
    }
}