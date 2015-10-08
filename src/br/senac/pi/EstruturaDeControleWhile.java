package br.senac.pi;

public class EstruturaDeControleWhile {

	public static void main(String[] args) {
		
		int n = 0;
		
		while(n <= 100) {
			System.out.println(n++);
		}
		
		//Loop infinito
		boolean var = true;
		while(var) {
			System.out.println("Loop infinito...");
		}

	}

}
