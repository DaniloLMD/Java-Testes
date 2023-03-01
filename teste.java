import java.util.Scanner;

public class teste{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
			System.out.print("Média: ");
			double media = input.nextInt();
			input.close();
		String resultado = media >= 770	 ? "Aprovado" : "Recuperação";
		System.out.printf("O aluno está %s", resultado);

	}
}