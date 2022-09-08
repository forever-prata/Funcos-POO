package com.funcoes.lista;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um valor");
		int num = scan.nextInt();
		
		System.out.println(Funcoes.identificar(num));
		
		
		scan.close();

	}

}
