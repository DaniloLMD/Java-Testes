package DesafiosAulas;
import java.util.Scanner;

public class Ex017ArrayNotasAluno {
    public static void main(String[] args) {
        double media = 0;
        Scanner input = new Scanner(System.in);
            System.out.print("Quantas notas você quer digitar: ");
            int totalNotas = input.nextInt();
            double[] notas = new double[totalNotas];
            for(int contador = 0; contador <  totalNotas; contador++){
                System.out.printf("Nota %d: ", contador + 1);
                notas[contador] = input.nextInt();
            }   
        input.close();
        for (double valor: notas){
            media += valor;
        }
        media /= totalNotas;
        System.out.printf("A média das %d notas do aluno foi de %.2f.", totalNotas, media);



    }

}
