import java.util.Random;

public class Exercicio9 {
	public static void main(String[] args) {
		
		Random gerador = new Random();
		int[] x = new int[10];
		int aux;
		
		// preenche e imprime antes da ordenação
		System.out.println("Antes da ordenação");
		for(int i = 0; i < x.length; i++) {
			x[i] = gerador.nextInt(10);
			System.out.print(x[i] + "  ");
		}
		
		// ordenação dos dados
		for(int j = 1; j <= x.length; j++) {
			for(int i = 0; i < x.length - 1; i++) {
				if(x[i] > x[i+1]) {
					aux = x[i];
					x[i] = x[i+1];
					x[i+1] = aux;
				}
			}
		}
		
		
		// impressão após a ordenação
		System.out.println("\n\nApós a ordenação");
		for(int i = 0; i < x.length; i++) {
			System.out.print(x[i] + "  ");
		}

	}
}
