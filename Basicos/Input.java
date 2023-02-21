package Basicos;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {





        Scanner input = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = input.nextLine();
        System.out.print("Sobrenome: ");
        String sobrenome = input.nextLine();
        System.out.print("Idade: ");
        int idade = input.nextInt();
        System.out.print("Nota para Java: ");
        double notaJava = input.nextDouble();
        System.out.printf("Olá, %s %s. Você foi registrado com %d anos. A sua nota para a linguagem Java foi: %.2f",
         nome, sobrenome, idade, notaJava);
        input.close();

    }
}
