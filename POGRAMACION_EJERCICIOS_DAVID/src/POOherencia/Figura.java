package POOherencia;

	abstract class Figura {
		 public abstract double calcularArea();
		}
		class Circulo extends Figura {
		    double radio;

		    public Circulo(double radio) {
		        this.radio = radio;
		    }
		    public double calcularArea() {
		        return Math.PI * Math.pow(radio, 2);
		    }
		}

		class Rectangulo extends Figura {
		    double base;
		    double altura;

		    public Rectangulo(double base, double altura) {
		        this.base = base;
		        this.altura = altura;
		    }
		    public double calcularArea() {
		        return base * altura;
		    }
		}


