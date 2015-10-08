package br.senac.pi;

public class Operacoes {

	public static void main(String[] args) {
		
		String nome = "Francisco ";
		String sobrenome = "André";
		
		System.out.println("Nome completo: " + nome + sobrenome);
		
		System.out.println("-----------------------------------------");
		
		int idade = 34;
		boolean brasileiro = true;
		
		System.out.println("Idade: " + idade);
		if (brasileiro) {
			System.out.println("Brasileiro: " + "sim");
		}
		
		
		System.out.println("Operações matemáticas");
		int n1 = 10;
		int n2 = 5;
		//Saída formatada com intercalação de valores
		System.out.printf("A soma entre %d e %d é: ", n1, n2);
		System.out.println(n1+n2); //Mostra o resultado
		System.out.printf("A multiplicação entre %d e %d é: ", n1, n2);
		System.out.println(n1*n2);
		System.out.printf("A subtração entre %d e %d é: ", n1, n2);
		System.out.println(n1-n2);
		System.out.printf("A divisão entre %d e %d é: ", n1, n2);
		System.out.println(n1/n2);
		System.out.printf("O resto da divisão entre %d e %d é: ", n1, n2);
		System.out.println(n1%n2);
		//Precedência de avaliação de operadores
		System.out.println((n1 + n2) * 5);
		

	}

}
