package Java-Udemy;
import java.util.Scanner;

public class teste{
    public static void main(String[] args) {




        Scanner input = new Scanner(System.in);
            System.out.print("Nota 1: ");
            String nota1 = input.nextLine();
            System.out.print("Nota 2: ");
            String nota2 = input.nextLine();
        input.close();

        System.out.printf("A média das notas %.2f e %.2f é %.2f.", 
        Double.parseDouble(nota1), Double.parseDouble(nota2),
         (Double.parseDouble(nota1) + Double.parseDouble(nota2)) / 2));

    }
}