
import java.util.Scanner;
public class teste {
    public static void main(String[] args) {
        // String operacao = "";
        StringBuilder operacao = new StringBuilder();
        int contador = 1;
        double resultado = 0;
        Scanner input = new Scanner(System.in);
            while (true){
                System.out.printf("Número %d: ", contador);
                String resposta = input.nextLine();
                if (resposta.equals("0")){
                    break;
                }
                //operacao += resposta + " + ";
                operacao.append(resposta).append(" + ");
                resultado += Double.parseDouble(resposta);
                contador++;
            }
        input.close();


        operacao.append(" = ").append(resultado);
        String finalOriginal = operacao.substring(operacao.lastIndexOf("+"));
        System.out.println(finalOriginal);
        String finalModificado = finalOriginal.replace("+ ", "");
        operacao = new StringBuilder(operacao.toString().replace(finalOriginal, finalModificado));

        System.out.println(operacao);
        }
    }
