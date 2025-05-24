package exercicio10;

public class Recursao {
	
	static int total;
	
	static int potencia(int a, int b) {
		
		if(b == 0) {
			return 1;
		}
		if(b == 1) {
			return a;
		}
		return total = a * potencia(a, b-1);
		
	}
}
