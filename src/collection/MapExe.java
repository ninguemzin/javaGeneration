package collection;

import java.util.HashMap;

public class MapExe {

	public static void main(String[] args) {

		HashMap<Long, String > pessoa = new HashMap<>();

		pessoa.put(1124122111L, "Felipe");
		pessoa.put(1124122311L, "Sansão");
		pessoa.put(1124122341L, "Sansão");
		
		System.out.println(pessoa);
		
		System.out.println(" " + pessoa.get(1124122311L));
		
	}

}
