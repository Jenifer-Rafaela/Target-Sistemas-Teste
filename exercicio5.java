
public class exercicio5 {

	public static void main(String[] args) {
		
		String nome = "Jenifer";
		String nomeInvertido = ""; 
		
		for (int i = nome.length()-1; i >= 0; i--) {
			nomeInvertido += nome.charAt(i);
		}
		
		System.out.println(nomeInvertido);
	}
}

