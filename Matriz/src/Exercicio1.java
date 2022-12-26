import java.util.Random;

public class Exercicio1 {
	public static void main(String[] args) {
		
		int[][] x = new int[3][3];
		Random gerador = new Random();
		int dp = 0, ds = 0;
		
		for(int i = 0; i < x.length; i++) {
			for(int j = 0; j < x.length; j++) {
				x[i][j] = gerador.nextInt(2, 25);
				System.out.print(x[i][j] + "\t");
				
				// soma dos elementos da diagonal principal
				if(i == j) {
					dp += x[i][j];
				}
				
				// soma dos elementos da diagonal secundária
				if(i + j == x.length - 1) {
					ds += x[i][j];
				}
			}
			System.out.println();
		}
		
		System.out.println("soma dos elementos da diagonal principal = " + dp);
		System.out.println("soma dos elementos da diagonal secundária = " + ds);

	}
}
