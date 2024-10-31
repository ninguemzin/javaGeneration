package vetor;

public class VetorEx1 {

	public static void main(String[] args) {
		String vetorString[] = {
				"Boxer", 
				"Pastor Alemão", 
				"Pinscher", 
				"Husky Siberiano", 
				"Corgi"
				};
		for(int i = 0; i < vetorString.length; i++) {
			System.out.println((i+1) + " elemento: " + vetorString[i] );
		}
		System.out.println("elemento 3 " + vetorString[2] );
	}

}
