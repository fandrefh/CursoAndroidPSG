package br.senac.pi;

public class TrabalhandoArrays {

	public static void main(String[] args) {
		
		int[] numeros;
		numeros = new int[10];
		/*numeros[0] = 7;
		numeros[1] = 8;
		numeros[2] = 9;
		numeros[3] = 5;
		numeros[4] = 9;
		numeros[5] = 10;
		numeros[6] = 20;
		numeros[7] = 22;
		numeros[8] = 23;
		numeros[9] = 21;*/
		for(int i = 0; i <= 15; i++) {
			//System.out.println("Posição " + i + " tem o número " + numeros[i]);
			try {
				numeros[i] = i;
				System.out.println("Número adicionado: " + numeros[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Erro: " + e);
			}
		}
		System.out.println("Código depois da exceção...");

	}

}
