import java.util.Random;

public class Exercicio8 {
	public static void main(String[] args) {
		
		Random gerador = new Random();
		int[][] x = new int[4][4];
		int aux;
		
		// preenche e imprime a matriz antes da troca
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				x[i][j] = gerador.nextInt(20, 87);
				System.out.print(x[i][j] + "\t");
			}
			System.out.println();
		}
		
		// troca os elementos das diagonais
		for(int i = 0, j = x.length -1; i < x.length; i++, j--) {
			aux = x[i][i];
			x[i][i] = x[i][j];
			x[i][j] = aux;
		}
		
		// imprime depois da troca
		System.out.println();
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				System.out.print(x[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
