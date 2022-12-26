import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int[] x = new int[5];
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		
		for(int i = 0; i < x.length; i++) {
			System.out.print("Valor: ");
			x[i] = teclado.nextInt();
			if(x[i] > maior) {
				maior = x[i];
			}
			
			if(x[i] < menor) {
				menor = x[i];
			}
		}

		System.out.println("maior = " + maior);
		System.out.println("menor = " + menor);
		
	}
}
