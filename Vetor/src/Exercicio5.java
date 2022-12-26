import java.util.*;

public class Exercicio5 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double[] temperatura = new double[7];
		String[] dia = {"Domingo", "Segunda", "Terca", "Quarta", 
				"Quinta", "Sexta", "Sábado"};
				
		for(int i = 0; i < temperatura.length; i++) {
			System.out.print("Temperatura do(a) " + dia[i] + " ");
			temperatura[i] = teclado.nextDouble();			
		}
		
		for(int i = 0; i < temperatura.length; i++) {
			System.out.print(String.format("%-7s", dia[i]) + " ");
			for(int j = 1; j <= temperatura[i]; j++) {
				System.out.print("-");
			}
			System.out.println();
		}
	}
}
