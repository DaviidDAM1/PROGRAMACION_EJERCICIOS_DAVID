package POO7;

public class ConversionUnidades_main {

	public static void main(String[] args) {
		double kilometros = 10;
        double millas = 6.21371;
        double celsius = 25;
        double fahrenheit = 77;

        System.out.println(kilometros + " kilómetros son " + ConversionUnidades.kilometrosAMillas(kilometros) + " millas.");
        System.out.println(millas + " millas son " + ConversionUnidades.millasAKilometros(millas) + " kilómetros.");
        System.out.println(celsius + " grados Celsius son " + ConversionUnidades.celsiusAFahrenheit(celsius) + " grados Fahrenheit.");
        System.out.println(fahrenheit + " grados Fahrenheit son " + ConversionUnidades.fahrenheitACelsius(fahrenheit) + " grados Celsius.");
    }

	}


