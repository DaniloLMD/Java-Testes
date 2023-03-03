package Basicos;

public class Switch {
    public static void main(String[] args) {
        //SEM BREAK
//        String computador = "sexo";

//        switch (computador.toLowerCase()){
//            case "bom":
//                System.out.println("Você pode rodar java!");
//
//            case "medio":
//                System.out.println("Você pode rodar HTML !");
//
//            case "ruim":
//                System.out.println("Você pode rodar Python!");
//            default:
//                System.out.println("Você é o pc do Pyr!");
//        }



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
