package com.funcoes.lista;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		final int IMPOSTO = 5;
		
		System.out.println("Digite o custo");
		float custo = scan.nextFloat();
		
		custo = Funcoes.somaImposto(IMPOSTO, custo);
		System.out.println(custo);
		
		scan.close();

	}

}
