package DesafiosAulas.Ex017PessoaComidaJantar;
import java.util.Scanner;
public class Jantar {
    public static void main(String[] x){
        String cardapio = """
             ------------------------
                1- Arroz   -    150g
                2- Feijão  -    150g
                3- Bife    -    200g
                4- Salada  -   -100g
             ------------------------
                """;

        Scanner input = new Scanner(System.in);
        Pessoa comando = new Pessoa();

        while (true) {
            System.out.print("Nome: ");
            String nome = input.next();
            System.out.print("Peso: ");
            double peso = input.nextInt();

            comando.setNome(nome);
            comando.setPeso(peso);

            System.out.println(String.format("\n%s tem %.2fkg.\n", comando.getNome(), comando.getPeso()));

            while (true){
                System.out.print(cardapio);
                System.out.print("Sua escolha: ");
                int escolha = input.nextInt();
                comando.Comer(escolha);

                System.out.printf("O peso de %s subiu para %.2f.\n", comando.getNome(), comando.getPeso());
                System.out.print("Continuar [S/N]: ");
                String continuar = input.next();
                if (continuar.equalsIgnoreCase("N")){
                    break;
                }
            }
            System.out.print("\nRegistrar outra pessoa [S/N]: ");
            String registrarNovo = input.next().toUpperCase();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            if (registrarNovo.equalsIgnoreCase("N")){
                break;
            }
        }
        input.close();
    }

}
