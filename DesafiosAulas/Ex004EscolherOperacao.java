package DesafiosAulas;
import java.util.Scanner;

public class Ex004EscolherOperacao {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Número 1: ");
        double num1 = input.nextDouble();

        System.out.print("Número 2: ");
        double num2 = input.nextDouble();

        System.out.print(
                """
                         Soma:            +
                         Subtração:      -
                         Divisão:        /
                         Multiplicação:  *
                         Sua escolha:    \
                        """);
        String operacao = input.next().replace(" ", "");
        input.close();

        boolean soma = operacao.equals("+");
        boolean subtracao = operacao.equals("-");
        boolean divisao = operacao.equals("/");
        boolean multiplicacao = operacao.equals("*");
        double resultado = soma ? num1 + num2 : 0;
        resultado = subtracao ? num1 - num2 : resultado;
        resultado = divisao ? num1 / num2 : resultado;
        resultado = multiplicacao ? num1 * num2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f", num1, operacao, num2, resultado);
    }
}
