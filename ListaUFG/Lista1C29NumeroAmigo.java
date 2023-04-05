package ListaUFG;
import java.util.Arrays;
import java.util.Scanner;

public class Lista1C29NumeroAmigo {
    public static void main(String[] args){

        int num1 = 220;
        int num2 = 1;
        int quantidadeDePares = 0;
        int somadivisores1;
        int somadivisores2;



        Scanner input = new Scanner(System.in);
            System.out.print("Quantidade de pares de numeros amigos: ");
            int escolha = input.nextInt();
        input.close();
        String[] listaParesAmigos = new String[escolha];

        while (quantidadeDePares < escolha){
            somadivisores1 = 0;
            somadivisores2 = 0;

            for (int divisor1 = 1; divisor1 < num1; divisor1++) {
                if (num1 % divisor1 == 0) {
                    somadivisores1 += divisor1;
                }
            }
            for (int divisor2 = 1; divisor2 < num2; divisor2++) {
                if (num2 % divisor2 == 0) {
                    somadivisores2 += divisor2;
                }
            }

            if (somadivisores1 == num2 && somadivisores2 == num1) {
                listaParesAmigos[quantidadeDePares] = String.format("(%d,%d)", num1, num2);
                quantidadeDePares++;
            }

            num2++;
            if (num1 * 2 == num2){
                num1++;
                num2 = num1 + 1;
            }
        }

        System.out.println(Arrays.toString(listaParesAmigos));

        for (String par:listaParesAmigos){
            System.out.println(par);
        }

    }
}
