package DesafiosAulas;
import java.util.Scanner;

public class Ex013PalavraLetraPorVez {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
            System.out.print("Texto: ");
            String texto = input.nextLine();
        input.close();
        for(int contador = 0; contador < texto.length(); contador++){
            System.out.println(texto.charAt(contador));
        }

    }
}
