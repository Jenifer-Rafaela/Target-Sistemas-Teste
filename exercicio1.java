
public class exercicio1 {

	public static void main(String[] args) {

		System.out.println(soma(13, 0, 0));
		
	}
	
	public static int soma(int INDICE, int SOMA, int K) {
		
		while(K < INDICE) {
			K = K+1;
			
			SOMA = SOMA + K;
		}
		
		return SOMA;	
	}

}
