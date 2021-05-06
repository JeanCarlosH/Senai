package br.com.senai;

public class LacoRepeticaoWhile {

	public static void main(String[] args) {
		int valor = 1;
		
		System.out.println("Valor antes do while: " + valor);
		
		while (valor < 10) {
			valor ++;
		}
		
		System.out.println("Valor depois do while: " + valor);
	}
}
