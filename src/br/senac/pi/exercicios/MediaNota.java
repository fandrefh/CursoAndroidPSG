package br.senac.pi.exercicios;

import java.util.Scanner;

public class MediaNota {

	public static void main(String[] args) {
		
		double nota = 0, soma = 0, media;
		
		System.out.print("Quantas avaliações foram? ");
		Scanner sc = new Scanner(System.in);
		int avaliacoes = sc.nextInt();
		
		for (int i = 1; i <= avaliacoes; i++) {
			System.out.print("Informe a " + i + " nota: ");
			nota = sc.nextDouble(); //nextDouble...
			soma += nota;
		}
		media = soma / avaliacoes;
		System.out.println("A média foi: " + media);
		
		if (media >= 7) {
			System.out.println("Aluno APROVADO!");
		} else if (media >= 6) {
			System.out.println("Aluno de RECUPERAÇÃO!");
		} else {
			System.out.println("Aluno REPROVADO!!!");
		}

	}

}
