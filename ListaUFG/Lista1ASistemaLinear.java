// aX + bY = c
// dX + eY = f
// x = ?
// y = ?

package ListaUFG;
import java.util.Scanner;

public class Lista1ASistemaLinear {
    public static void main(String[] args){
        System.out.println("""
                Ax + By = C
                Dx + Ey = F""");

        Scanner input = new Scanner(System.in);
            System.out.print("Valor de A: ");
            double a = input.nextDouble();
            System.out.print("Valor de B: ");
            double b = input.nextDouble();
            System.out.print("Valor de C: ");
            double c = input.nextDouble();
            System.out.print("Valor de D: ");
            double d = input.nextDouble();
            System.out.print("Valor de E: ");
            double e = input.nextDouble();
            System.out.print("Valor de F: ");
            double f = input.nextDouble();
        input.close();
        System.out.println("---------------------");
        System.out.printf("""
                %.2f x + %.2f y = %.2f
                %.2f x + %.2f y = %.2f""", a, b, c, d, e, f);

        double x;
        double y;
        if ((a > 0 && d > 0) || (a < 0 && d < 0)){
            y = (d*c - f*a) / (b*d - e*a);
        } else{
            y = (d*c + f*a) / (b*d + e*a);
        }
        x = (c - b*y) / a;

        System.out.println();
        System.out.printf("Valor de X: %.2f\n", x);
        System.out.printf("Valor de Y: %.2f\n", y);
    }
}
