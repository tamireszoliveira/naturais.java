package view;
import javax.swing.JOptionPane;

import controller.NaturaisController;

/* 1. Criar uma aplicação em Java que tenha uma função recursiva que calcule o somatório do N primeiros
número NATURAIS (a função deve retornar zero para números nega vos)
O Código deve apresentar, em formato de comentário, como foi definida a condição de parada;
O Código deve apresentar, em formato de comentário, como foi definida a relação de chamada dos
 passos; */

public class main {

	public static void main(String[] args) {
		NaturaisController nat = new NaturaisController();
		int naturais = 0;
		 int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero"));
		 naturais = nat.naturais(n);
		 System.out.println(naturais);
	}
	
}