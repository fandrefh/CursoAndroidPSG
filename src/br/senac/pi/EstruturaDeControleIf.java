package br.senac.pi;

public class EstruturaDeControleIf {

	public static void main(String[] args) {
		int idade = 17;
		if (idade >= 18) {
			System.out.println("Blz, pode entrar!");
		} else if (idade >= 17) {
			System.out.println("Pode entrar com acompanhante!");
		} else {
			System.out.println("Vai pra casa dormir rapaz...");
		}
		
		//Outra construção com o IF
		boolean var = true;
		if(var) {
			System.out.println("Isto vai ser executado se for true.");
		} else {
			System.out.println("Isto vai ser executado se for false.");
		}

	}

}
