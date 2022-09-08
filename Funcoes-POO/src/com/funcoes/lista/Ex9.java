package com.funcoes.lista;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int num = scan.nextInt();
		
		System.out.println(Funcoes.reverse(num));
		
		scan.close();

	}

}
