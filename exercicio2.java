
public class exercicio2 {

	public static void main(String[] args) {
		System.out.println(fibonacci(31));	
	}
	
	public static String fibonacci(int n) {
		int fibonacci = 1; 
		int anterior = 0; 

		while(fibonacci <= n) {
			if(fibonacci == n) {
				return "O número "+ n +" pertence a sequência";
			} else {
				fibonacci += anterior;
				anterior = fibonacci - anterior;
			}
		}
		return "O número "+ n +" não pertence a sequência";
	}

}
