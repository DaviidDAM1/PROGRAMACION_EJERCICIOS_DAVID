package POO7;

public class ConversionUnidades {
	public static double kilometrosAMillas(double kilometros) {
        return kilometros * 0.621371;
    }
    public static double millasAKilometros(double millas) {
        return millas / 0.621371;
    }

    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}

