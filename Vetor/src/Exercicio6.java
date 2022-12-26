import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int qtdSala, qtdAluno;
		int[] nota;
		double media;
		double porcentagem;
		
		System.out.print("Quantidade de salas --> ");
		qtdSala = teclado.nextInt();
		
		for(int sala = 1; sala <= qtdSala; sala++) {
			System.out.println("Sala #" + sala);
			System.out.print("Quantidade de alunos --> ");
			qtdAluno = teclado.nextInt();
			nota = new int[qtdAluno];
			media = 0;
			for(int aluno = 0; aluno < qtdAluno; aluno++) {
				System.out.print("Media do aluno #" + (aluno+1) + " ");
				nota[aluno] = teclado.nextInt();
				media = media + nota[aluno]; //media += nota[aluno];
			}
			media = media / qtdAluno; // media /= qtdAluno
			System.out.println("media da sala = " + String.format("%.3f", media));
			porcentagem = 0;
			
			for(int i = 0; i < qtdAluno; i++) {
				if(nota[i] > media) {
					porcentagem++;
				}
			}
			porcentagem = porcentagem / qtdAluno * 100;
			System.out.println("Porcentagem = " + String.format("%.3f", porcentagem));
			
			System.out.println();
		}
	}
}
