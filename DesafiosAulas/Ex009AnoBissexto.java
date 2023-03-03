package DesafiosAulas;
import java.util.Scanner;

public class Ex009AnoBissexto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.print("Ano: ");
            int ano = input.nextInt();
        input.close();
        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0){
            System.out.println("É bissexto!");
        }
        else{
            System.out.println("NÃO é bissexto!");
        }

    }
}
