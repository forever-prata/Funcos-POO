package com.funcoes.lista;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a data no formato dd/mm/aaaa");
		String data = scan.nextLine();
		
		System.out.println(Funcoes.data(data));
		
		scan.close();
		
		
		

	}

}
