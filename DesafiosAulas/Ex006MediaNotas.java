package DesafiosAulas;
import java.util.Scanner;
public class Ex006MediaNotas {
    public static void main(String[] args){
        int notasValidas = 0;
        double media = 0;
        Scanner input = new Scanner(System.in);
        while (true){
                System.out.printf("Nota %d : ", notasValidas+1);
                double nota = input.nextDouble();
                if ((nota < 0 && nota != -1)|| nota > 10){
                    System.out.println("Por favor digite uma nota entre 0 e 10.");
                }
                else if (nota == -1){
                    break;
                }else {
                    notasValidas ++;
                    media += nota;
                }
        }
        input.close();
        media = media / notasValidas;
        System.out.printf("A média das %d notas informadas foi %.2f", notasValidas, media);
    }
}