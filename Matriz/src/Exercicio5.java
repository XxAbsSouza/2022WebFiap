import java.util.Random;

public class Exercicio5 {
	public static void main(String[] args) {
		
		Random gerador = new Random();
		int linha = 3;
		int coluna = 3;
		int[][] a = new int[linha][coluna];
		int[][] b = new int[coluna][linha];
		
		// preenche a matriz a, imprimir e preencher b
		for(int i = 0; i < linha; i++) {
			for(int j = 0; j < coluna; j++) {
				a[i][j] = gerador.nextInt(15);
				b[j][i] = a[i][j];
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		
		// impressão da matriz b
		System.out.println();
		for(int i = 0; i < coluna; i++) {
			for(int j = 0; j < linha; j++) {
				System.out.print(b[i][j] + "\t");
			}
			System.out.println();
		}

	}
}
