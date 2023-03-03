package DesafiosAulas;
import java.util.Scanner;
import java.util.Random;
public class Ex011NumeroAleatorio {
    public static void main(String[] args) {
        Random randint = new Random();
            int numeroGerado = randint.nextInt(100);

        int tentativas = 10;
        Scanner input = new Scanner(System.in);
        while (tentativas >= 1){
                System.out.printf("Você tem %d tentativas!\n", tentativas);

                System.out.print("Escolha: ");
                int escolha = input.nextInt();
                if (escolha == numeroGerado){
                    break;
            }
                System.out.println("Errou! Tente novamente.");
                System.out.println("------------------------------------------------------");
                tentativas--;
        }
        input.close();
        if (tentativas >= 1){
            System.out.println("Você venceu!");
        }
        else{
            System.out.printf("Você perdeu! O número era %d.", numeroGerado);
        }
    }
}
