package br.senac.pi.poo;

public class Carro {
	//Atributos da classe (Objeto) Carro
	String marca;
	String modelo;
	int ano;
	String placa;
	String chassi;
	
	//Comportamento da classe (Objeto) Carro
	public void partida() {
		System.out.println("Carro ligado...");
	}
	
	public void acelerar() {
		System.out.println("Carro acelerado...");
	}
	
	public void freiar() {
		System.out.println("Carro parado...");
	}

}
