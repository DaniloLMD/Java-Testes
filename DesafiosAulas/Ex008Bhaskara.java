package DesafiosAulas;
import java.util.Scanner;
public class Ex008Bhaskara {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
             System.out.print("Valor de A: ");
             double a = input.nextDouble();
             System.out.print("Valor de B: ");
             double b = input.nextDouble();
             System.out.print("Valor de C: ");
             double c = input.nextDouble();
        input.close();
        double delta = Math.pow(b, 2) - 4 * a * c;
        double x1 = (-b + Math.sqrt(delta))/ 2 * a;
        double x2 = (-b - Math.sqrt(delta))/ 2 * a;
        System.out.printf("%.0f x² + %.0f x + %.0f = 0\n", a, b, c);
        System.out.printf("O delta dessa equação vale %.2f\n", delta);
        System.out.printf("O valor de X nessa equação vale: %.2f E %.2f", x1, x2);
    }
}
