import java.util.Scanner;

public class Exemplo1 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int[][] x = new int[2][3];
		
		// preenchimento da tabela
		for(int i = 0; i < x.length; i++) {
			for(int j = 0; j < x[i].length; j++) {
				System.out.print("Valor --> ");
				x[i][j] = teclado.nextInt();
			}
		}
		
		System.out.println();
		for(int i = 0; i < x.length; i++) {
			for(int j = 0; j < x[i].length; j++) {
				System.out.print(x[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
