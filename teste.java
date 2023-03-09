public class teste {

    static int x = 0;
    static int y = 0;


    public static void main(String[] args) {
            teste comando = new teste();
            System.out.println(x + " " + y);
            int teste = comando.Soma(5, 3);
            System.out.println(teste);
            System.out.printf("%d %d", x, y);
        }

    int Soma(int x, int y){
            this.x = x;
            this.y = y;
            return x + y;
        }
    }
