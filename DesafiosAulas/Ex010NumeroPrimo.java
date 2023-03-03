package DesafiosAulas;
import java.util.Scanner;
public class Ex010NumeroPrimo {
    public static void main(String[] args) {
        int divisores = 0;
        Scanner input = new Scanner(System.in);
            System.out.print("Número: ");
            int numero = input.nextInt();
        input.close();
        for (int contador = 1; contador <= numero; contador++){
            if (numero % contador == 0){
                divisores++;
            }
        }
        if (divisores == 2){
            System.out.println("É primo!");
        }
        else{
            System.out.printf("NÃO é primo, pois tem %d divisores!", divisores);
        }
    }
}
