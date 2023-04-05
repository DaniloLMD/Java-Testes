package Testando;

public class aaa {
    public static void main(String[] args) {
        usuarios comando1 = new usuarios();
        comando1.nome = "Ronaldy";
        comando1.idade = 28;

        usuarios comando2 = new usuarios();
        comando2.nome = "Ronaldy";
        comando2.idade = 13;


        boolean teste = comando1.nome.equals(comando2.nome);
        System.out.println(teste);
    }
}
