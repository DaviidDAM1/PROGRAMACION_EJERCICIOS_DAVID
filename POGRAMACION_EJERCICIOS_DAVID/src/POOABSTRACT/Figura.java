package POOABSTRACT;

abstract class FiguraGeometrica {
	abstract double calculararea();
}

	class Rectangulo extends FiguraGeometrica {
	    private double base;
	    private double altura;

	    public Rectangulo(double base, double altura) {
	        this.base = base;
	        this.altura = altura;
	    }

	    @Override
	    double calculararea() {
	        return base * altura;
	    }
	}

	class Circulo extends FiguraGeometrica {
	    private double radio;

	    public Circulo(double radio) {
	        this.radio = radio;
	    }

	    @Override
	    double calculararea() {
	        return Math.PI * radio * radio;
	    }
	}
	