package DesafiosAulas;

public class Ex002FahrenheitParaCelsius{
    public static void main(String[] args) {
        double fahrenheit = 32;
        final double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit +" fahrenheit = " + celsius + " celsius");
        System.out.printf("%.2f Graus Fahrenheit equivalem à %.2f Graus Celsius.", fahrenheit, celsius);
    }
}
