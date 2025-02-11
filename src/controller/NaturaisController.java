package controller;

public class NaturaisController {
	/* 1. Criar uma aplicação em Java que tenha uma função recursiva que calcule o somatório do N primeiros
número NATURAIS (a função deve retornar zero para números nega�vos)
O Código deve apresentar, em formato de comentário, como foi definida a condição de parada;
O Código deve apresentar, em formato de comentário, como foi definida a relação de chamada dos passos; */
	
	public 	NaturaisController() {
		super();
	}
	
	public int naturais(int n) {
		// parar quando n = 0
		if (n == 0) {
			return 0;
		} else {
			return n + naturais(n - 1);
			// retorna n + o resultado da chamada de naturais, que passa n - 1
		}
		
	}
	


}