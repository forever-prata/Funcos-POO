package com.funcoes.lista;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma palavra");
		String str = scan.nextLine();
		
		System.out.println(Funcoes.embaralha(str));
		
		scan.close();

	}

}
