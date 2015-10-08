package br.senac.pi.exercicios;

import java.util.Scanner;

public class MediaSalario {

	public static void main(String[] args) {
		
		double mediaSalario = 0;
		double somaSalario = 0;
		double salario = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual a quantidade de funcion�rios? ");
		int funcionarios = sc.nextInt();
		
		for(int i = 1; i <= funcionarios; i++) {
			System.out.print("Informe o sal�rio do funcion�rio " + i + ": ");
			salario = sc.nextFloat(); //nextFloat...
			somaSalario += salario;
		}
		
		mediaSalario = somaSalario / funcionarios;
		System.out.print("A m�dia dos sal�rios �: " + mediaSalario);
		sc.close();
	}

}
