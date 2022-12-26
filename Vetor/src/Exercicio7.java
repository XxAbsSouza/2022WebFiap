import java.util.Random;

public class Exercicio7 {
	public static void main(String[] args) {
		
		Random gerador = new Random();
		int[] x = new int[10];
		boolean achei;
		
		for(int i = 0; i < x.length; ) {
			x[i] = gerador.nextInt(8);
			achei = false;
			for(int j = 0; j < i; j++) {
				if(x[j] == x[i]) {
					achei = true;
					break;
				}
			}
			if(!achei) { // if(achei == false)
				System.out.print(x[i] + " ");
				i++;
			}
		}

	}
}
