import java.util.Random;

public class Exercicio2 {
	public static void main(String[] args) {
		
		Random gerador = new Random();
		int[][] m = new int[4][4];
		int maior = 0;
		
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m.length; j++) {
				m[i][j] = gerador.nextInt(20);
				System.out.print(m[i][j] + "\t");
				if(m[i][j] > maior) {
					maior = m[i][j];
				}
			}
			System.out.println();
		}
		System.out.println("\nMaior = " + maior);
		
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m.length; j++) {
				if(m[i][j] == maior) {
					System.out.println("linha = " + (i+1));
					System.out.println("coluna = " + (j+1));
					System.out.println();
				}
			}
		}		
	}
}
