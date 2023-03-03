package DesafiosAulas;

public class Ex007ForSemNumerico {
    public static void main(String[] args) {
        String valor = "#";



        for (String controle = ""; !"#####".equals(controle); controle += "#") {
            System.out.println(valor)  ;
            valor += "#"      ;
        }


    }
}
