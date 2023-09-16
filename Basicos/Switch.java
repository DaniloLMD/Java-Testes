package Basicos;

public class Switch {
    public static void main(String[] args) {

        // COM BREAK
        int nota = 6;
        String aluno = "";
        switch (nota) {
            case 10:
            case 9:
                aluno = "A";
                break;
            case 8:
            case 7:
                aluno = "B";
                break;
            case 6:
            case 5:
                aluno = "C";
                break;
            case 4:
            case 3:
                aluno = "D";
                break;
            case 2:
            case 1:
            case 0:
                aluno = "E";
                break;
            default:
                aluno = "ERRO NA NOTA";
        }
        System.out.printf("O aluno com a nota %d adquiriu a posição %s.", nota, aluno);
    }

}
