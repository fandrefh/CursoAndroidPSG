package br.senac.pi.exercicios;

public class NumerosImpares {

	public static void main(String[] args) {
		
		for(int i = 0; i <= 100; i++) {
			if(i % 2 != 0) {
				System.out.println("Número ímpar da vez: " + i);
			}
		}

	}

}
