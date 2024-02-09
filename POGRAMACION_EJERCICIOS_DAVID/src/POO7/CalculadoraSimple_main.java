package POO7;

public class CalculadoraSimple_main {

	public static void main(String[] args) {
		double num1 = 10;
        double num2 = 5;

        System.out.println("Suma: " + num1 + " + " + num2 + " = " + CalculadoraSimple.sumar(num1, num2));
        System.out.println("Resta: " + num1 + " - " + num2 + " = " + CalculadoraSimple.restar(num1, num2));
        System.out.println("Multiplicación: " + num1 + " * " + num2 + " = " + CalculadoraSimple.multiplicar(num1, num2));
        System.out.println("División: " + num1 + " / " + num2 + " = " +CalculadoraSimple.dividir(num1, num2));
    }


	}


