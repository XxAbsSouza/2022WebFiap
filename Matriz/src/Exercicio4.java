import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int totalCompetidor, totalLancamento;
		double total;
		
		System.out.print("Total de competidores --> ");
		totalCompetidor = teclado.nextInt();
		System.out.print("Total de lançamentos --> ");
		totalLancamento = teclado.nextInt();
		
		String[] nome = new String[totalCompetidor];
		double[][] lancamento = new double[totalCompetidor][totalLancamento + 1];
		
		for(int i = 0; i < totalCompetidor; i++) {
			teclado.nextLine();
			System.out.println("Competidor " + (i+1));
			System.out.print("Nome: ");
			nome[i] = teclado.nextLine();
			total = 0;
			for(int j = 0; j < totalLancamento; j++) {
				System.out.print("Lançamento " + (j+1) + " ");
				lancamento[i][j] = teclado.nextDouble();
				total += lancamento[i][j];
			}
			System.out.println();
			lancamento[i][totalLancamento] = total;
		}
		
		// impressão dos nomes e a soma de cada competidor
		System.out.println();
		for(int i = 0; i < totalCompetidor; i++) {
			System.out.println(nome[i] + " --> " + lancamento[i][totalLancamento]);
		}
		

	}
}
