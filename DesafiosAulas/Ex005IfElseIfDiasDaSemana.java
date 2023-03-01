package DesafiosAulas;
import java.util.Scanner;

public class Ex005IfElseIfDiasDaSemana {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
            System.out.print("""
                    1- Domingo
                    2- Segunda
                    3- Terça
                    4- Quarta
                    5- Quinta
                    6- Sexta
                    7- Sábado
                    
                    Sua escolha:""");
            int escolha = input.nextInt();
        input.close();
        if (escolha == 1){
            System.out.print("Você escolheu Domingo.");
        }
        else if (escolha ==2 ){
            System.out.print("Você escolheu Segunda.");
        }
        else if (escolha == 3 ){
            System.out.print("Você escolheu Terça.");
        }
        else if (escolha == 4 ){
            System.out.print("Você escolheu Quarta.");
        }
        else if (escolha == 5 ){
            System.out.print("Você escolheu Quinta.");
        }
        else if (escolha == 6 ){
            System.out.print("Você escolheu Sexta.");
        }
        else if (escolha == 7 ){
            System.out.print("Você escolheu Sábado.");
        }
        else{
            System.out.print("Opção inválida!");
        }
    }
}
