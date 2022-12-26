import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int total;
		
		System.out.print("Total de números: ");
		total = teclado.nextInt();
		
		int[] x = new int[total];
		int par = 0;
		
		for(int i = 0; i < x.length; i++) {
			System.out.print("Valor: ");
			x[i] = teclado.nextInt();
			if(x[i] % 2 == 0) {
				par++;
			}
		}
		
		System.out.println("Total de pares = " + par);
		System.out.println("Total de ímpares = " + (x.length - par));

	}
}
