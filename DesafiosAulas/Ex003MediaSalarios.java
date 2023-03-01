import java.util.Scanner;

public class Ex003MediaSalarios {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.print("Salário 1: R$ ");
            String sal1 = input.nextLine().replace(",", ".");
            System.out.print("Salário 2: R$ ");
            String sal2 = input.nextLine().replace(",", ".");
            System.out.print("Salário 3: R$ ");
            String sal3 = input.nextLine().replace(",", ".");
        input.close();
        double media = (Double.parseDouble(sal1) + Double.parseDouble(sal2) + Double.parseDouble(sal3)) / 3;
        System.out.printf("A média dos salários foi de %.2f", media);
    }
}
