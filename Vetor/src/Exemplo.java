import java.util.Random;

public class Exemplo {
	public static void main(String[] args) {
		
		Random gerador = new Random();
		
		int x = gerador.nextInt()%50;
		
		System.out.println(x);

	}
}
