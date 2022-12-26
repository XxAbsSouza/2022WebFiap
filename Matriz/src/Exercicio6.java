import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Random gerador = new Random();
		
		int linha_a, linha_b;
		int coluna_a, coluna_b;
		int soma;
		
		System.out.print("Total de linhas da matriz A --> ");
		linha_a = teclado.nextInt();
		System.out.print("Total de colunas da matriz A --> ");
		coluna_a = teclado.nextInt();
		linha_b = coluna_a;
		System.out.print("Total de colunas da matriz B --> ");
		coluna_b = teclado.nextInt();
		
		int[][] a = new int[linha_a][coluna_a];
		int[][] b = new int[linha_b][coluna_b];
		int[][] c = new int[linha_a][coluna_b];
		
		// preencher e imprimir a matriz A
		System.out.println("Matriz A:");
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				a[i][j] = gerador.nextInt(4);
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		
		// preencher e imprimir a matriz B
		System.out.println("\nMatriz B:");
		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j < b[i].length; j++) {
				b[i][j] = gerador.nextInt(4);
				System.out.print(b[i][j] + "\t");
			}
			System.out.println();
		}
		
		// multiplicação de A e B gerando C
		for(int i = 0; i < linha_a; i++) {
			for(int k = 0; k < coluna_b; k++) {
				soma = 0;
				for(int j = 0; j < coluna_a; j++) {
					soma += a[i][j] * b[j][k];
				}
				c[i][k] = soma;
			}
		}
		
		// imprimir a matriz C
		System.out.println("\nMatriz C:");
		for(int i = 0; i < c.length; i++) {
			for(int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
