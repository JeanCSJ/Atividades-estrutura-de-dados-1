package exercicio9;

public class Recursao {
	static int total = 0;
	
	static int soma(String numeros[], int tamanho) {
		
		if (tamanho < 0) {
            return 0;
		}
		
		total += Integer.parseInt(numeros[tamanho]) + soma(numeros, tamanho-1);
		return total;
	}
}
