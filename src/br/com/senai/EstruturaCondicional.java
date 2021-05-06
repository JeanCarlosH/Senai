package br.com.senai;

import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Informe a sua idade: ");
		int idade = in.nextInt();
		
		if (idade <= 12) {
			System.out.println("Criança");
			
		} else if (idade >= 13 && idade < 16) {
			System.out.println("Adolencente");
			
		} else if (idade >= 16 && idade < 18) {
			System.out.println("Jovem");
			
		} else if (idade >= 18 && idade < 65) {
			System.out.println("Adulto");
			
		} else {
			System.out.println("Idoso");
		}
	}
}
