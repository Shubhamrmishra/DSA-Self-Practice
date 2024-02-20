package Dec11;

public class Temperature {
    public static void main(String[] args) {

        CelsiusToFahrenheit(40.2);
        FahrenheitToFahrenheit(104.36);
    }

    static void FahrenheitToFahrenheit(double v) {
        double temp = (v - 32)* 5/9;
        System.out.println("Fahrenheit is " + temp);
    }

    static void CelsiusToFahrenheit(double i) {
        double temp = (i * 9/5) + 32;
        System.out.println("Temperature is " + temp);
    }
}
