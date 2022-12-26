import java.util.*;

public class Exercicio4 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double[] temperatura = new double[7];
		String[] dia = {"Domingo", "Segunda", "Terca", "Quarta", 
				"Quinta", "Sexta", "Sábado"};
		double media = 0;
		
		for(int i = 0; i < temperatura.length; i++) {
			System.out.print("Temperatura do(a) " + dia[i] + " ");
			temperatura[i] = teclado.nextDouble();
			media += temperatura[i]; // media = media + ...
		}
		
		media /= temperatura.length;
		System.out.println("\nmédia = " + String.format("%.2f\n", media));

		for(int i = 0; i < temperatura.length; i++) {
			if(temperatura[i] > media) {
				System.out.println(dia[i]);
			}
		}
	}
}
