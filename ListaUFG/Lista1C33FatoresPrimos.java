package ListaUFG;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

public class Lista1C33FatoresPrimos {
    public static void main(String[] args) {


        int escolha;
        String fatoracao;
        int divisores = 0;
        double resultado;
        Set<Integer> listaDePrimos = new TreeSet<>();

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Numero a ser fatorado: ");
            escolha = input.nextInt();
            if (escolha > 0) {
                break;
            }
            System.out.printf("O número \"%d\" é menor que 1!\n", escolha);
        }
        input.close();
        fatoracao = String.format("%d = ", escolha);

        for (int contador1 = 2; contador1 < escolha; contador1++){
            for (int contador2 = 1; contador2 <= contador1; contador2++){
                if (contador1 % contador2 == 0){
                    divisores++;
                }
            }
            if (divisores == 2){
                listaDePrimos.add(contador1);
            }
            divisores = 0;
        }

        for (int valor: listaDePrimos){
            resultado = (double) escolha / valor;
            while (true) {
                if (Math.floor(resultado) == resultado && resultado > 0) {
                    escolha /= valor;
                    if (escolha != 1){
                        fatoracao += String.format("%d * ", valor);
                    }else{
                        fatoracao += String.format("%d", valor);
                    }

                }else{
                    break;
            }
                resultado = (double) escolha / valor;
            }
        }

        System.out.println(fatoracao);
    }
}




