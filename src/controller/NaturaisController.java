package controller;

public class NaturaisController {
	
	
	public 	NaturaisController() {
		super();
	}
	
	public int naturais(int n) {
		// parar quando n = 0 e retornar 0 caso n seja negativo
		if (n <= 0) {
			return 0;
		} else {
			return n + naturais(n - 1);
			// retorna n + o resultado da chamada de naturais, que passa n - 1
		}
		
	}
}