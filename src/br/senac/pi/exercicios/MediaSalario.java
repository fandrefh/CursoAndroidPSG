package br.senac.pi.exercicios;

import java.util.Scanner;

public class MediaSalario {

	public static void main(String[] args) {
		
		double mediaSalario = 0;
		double somaSalario = 0;
		double salario = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual a quantidade de funcionários? ");
		int funcionarios = sc.nextInt();
		
		for(int i = 1; i <= funcionarios; i++) {
			System.out.print("Informe o salário do funcionário " + i + ": ");
			salario = sc.nextFloat(); //nextFloat...
			somaSalario += salario;
		}
		
		mediaSalario = somaSalario / funcionarios;
		System.out.print("A média dos salários é: " + mediaSalario);
		sc.close();
	}

}
