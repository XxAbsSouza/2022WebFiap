import java.util.Random;
import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Random gerador = new Random();
		int totalVendedor;
		
		System.out.print("Total de vendedores --> ");
		totalVendedor = teclado.nextInt();
		
		//declaração dos arrays
		String[] mes = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun"};
		String[] vendedor = new String[totalVendedor];
		double[][] venda = new double[totalVendedor][mes.length + 1];
		double total;
		double maiorVenda, menorVenda;
		int indexMaiorVenda = 0;
		
		// entrada dos vendedores e o total de vendas de cada um
		teclado.nextLine();
		for(int i = 0; i < totalVendedor; i++) {
			System.out.print("Nome do vendedor #" + (i + 1) + " ");
			vendedor[i] = teclado.nextLine();
			total = 0;
			for(int j = 0; j < mes.length; j++) {
				venda[i][j] = gerador.nextInt(5);
				total += venda[i][j];
			}
			venda[i][mes.length] = total;
		}
		
		// impressão das vendas
		System.out.println();
		System.out.println("Tabela de vendas");
		for(int i = 0; i < totalVendedor; i++) {
			for(int j = 0; j < mes.length; j++) {
				System.out.print(String.format("%.2f\t", venda[i][j]));
			}
			System.out.println();
		}
		
		// a --> impressão dos vendedores e os respectivos totais
		System.out.println();
		System.out.println("Listagem de vendedores e suas vendas");
		for(int i = 0; i < totalVendedor; i++) {
			System.out.println(vendedor[i] + " ---> R$ " + String.format("%.2f", venda[i][mes.length]));
		}

		// c --> vendedor com a maior venda
		System.out.println();
		System.out.println("Vendedor com a maior venda");
		maiorVenda = 0;
		for(int i = 0; i < totalVendedor; i++) {
			if(venda[i][mes.length] > maiorVenda) {
				maiorVenda = venda[i][mes.length];
				indexMaiorVenda = i;				
			}
		}
		System.out.println(vendedor[indexMaiorVenda]);
		
	}
}
