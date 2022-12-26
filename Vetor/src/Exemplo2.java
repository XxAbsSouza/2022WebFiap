import java.util.Random;

public class Exemplo2 {
	public static void main(String[] args) {
		
		Random gerador = new Random();
		
		int x = gerador.nextInt(25, 278);
		double y = gerador.nextDouble(250);
		
		System.out.println(y);

	}
}
