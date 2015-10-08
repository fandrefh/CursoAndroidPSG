package br.senac.pi;

public class EstruturaDeControleSwitch {

	public static void main(String[] args) {
		
		int n = 1;
		
		switch (n) {
		case 1:
			System.out.println("O valor da variável é 1");
			break;
		case 2:
			System.out.println("O valor da variável é 2");
			break;
		case 3:
			System.out.println("O valor da variável é 3");
		case 4:
			System.out.println("O valor da variável é 4");
			break;

		default:
			System.out.println("Nenhum valor na variável.");
			break;
		}

	}

}
