package Basicos;

public class BreakContinue {
    public static void main(String[] args) {
        // BREAK
//        int contador = 1;
//        while (true) {
//            System.out.println(contador);
//            contador++;
//            if (contador > 10)
//                break;

            // CONTINUE
            for (int contador = 1; contador <= 5; contador++) {
                if (contador == 3) {
                    continue;
                }
                System.out.printf("Número %d exibido!\n", contador);
            }
            System.out.println("Pulei o número três!");
        }
    }

