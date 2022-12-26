import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int totalFuncionario;
		
		// lê a quantidade de funcionários da empresa
		System.out.print("Qual o total de funcionários? ");
		totalFuncionario = teclado.nextInt();
		
		// declara os arrays para armazenar os salários e os nomes dos funcionários
		String[] nome = new String[totalFuncionario];
		double[] salario = new double[totalFuncionario];
		
		// variáveis para armazenar o total da folha de pagamento e a média salarial
		double totalFolha = 0, media;
		
		for(int i = 0; i < totalFuncionario; i++) {
			teclado.nextLine(); // limpa o "enter" que sobrou da entrada de dados anterior
			System.out.println("Funcionário " + (i+1) + ":");
			System.out.print("Nome: ");
			nome[i] = teclado.nextLine();
			System.out.print("Salário: R$ ");
			salario[i] = teclado.nextDouble();
			
			totalFolha += salario[i];
			System.out.println();
		}
		
		media = totalFolha / totalFuncionario;
		
		System.out.println("Total da folha de pagamento R$ " + String.format("%.2f", totalFolha));
		System.out.println("Média salarial R$ " + String.format("%.2f", media));

	}

}
