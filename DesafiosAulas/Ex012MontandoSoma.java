package DesafiosAulas;

import java.util.Scanner;
public class Ex012MontandoSoma {
    public static void main(String[] args) {
        double resultado = 0;
        String operacao = "";
        int contador = 1;
        Scanner input = new Scanner(System.in);
            while(true) {
                System.out.printf("Número %d: ", contador);
                String resposta = input.nextLine().replace(",", ".");
                double valor = Double.parseDouble(resposta);
                if (valor == 0) {
                    break;
                }

                resultado += valor;
                operacao += resposta + " + ";
                contador++;
            }
        input.close();
        operacao += "DEL";
        operacao = operacao.replace(" + DEL", "");
        int resultadoInt = (int) resultado;
        if (resultadoInt < resultado){
            operacao += " = " + resultado;
        }
        else{
            operacao += " = " + resultadoInt;
        }
        System.out.println(operacao);

    }
}
