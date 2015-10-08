package br.senac.pi.exercicios;

import java.util.Scanner;

public class BonusSalario {

	public static void main(String[] args) {
		
		double bonus;
		
		System.out.print("Informe o cargo: ");
		Scanner sc = new Scanner(System.in);
		String cargo = sc.next();
		System.out.print("Informe o salário: ");
		float salario = sc.nextFloat();
		
		if(cargo.toUpperCase().equals("GERENTE")) {
			System.out.println("Cargo: " + cargo);
			System.out.println("Salário: " + salario);
			bonus = salario * 0.15;
			System.out.print("Valor do bônus: " + bonus);
		} else if (cargo.toUpperCase().equals("COORDENADOR")) {
			System.out.println("Cargo: " + cargo);
			System.out.println("Salário: " + salario);
			bonus = salario * 0.10;
			System.out.print("Valor do bônus: " + bonus);
		} else if (cargo.toUpperCase().equals("SUPERVISOR")) {
			System.out.println("Cargo: " + cargo);
			System.out.println("Salário: " + salario);
			bonus = salario * 0.08;
			System.out.print("Valor do bônus: " + bonus);
		} else {
			System.out.println("Nada foi informado.");
		}
	}

}
