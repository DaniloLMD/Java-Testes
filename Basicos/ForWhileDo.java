package Basicos;

public class ForWhileDo {
    public static void main(String[] args){
        int contador = 1;
        while(true){
            System.out.printf("Já mostrei essa mensagem %d vezes utilizando WHILE!\n", contador);
            contador++;
            if (contador > 5){
                break;
            }
        }
        contador = 1;

        for (int cont = 1; cont <= 5; cont++ ){
            System.out.printf("Já mostrei essa mensagem %d vezes utiizando FOR!\n", cont);
        }

        do {
            System.out.printf("Já mostrei essa mensagem %d vezes utilizando DO!\n", contador);
            contador++;
        } while (contador <= 5);

    }

}
