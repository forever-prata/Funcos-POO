package com.funcoes.lista;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Digite a hora (formato 24h) : ");
		int hora = scan.nextInt();
		
		String str = "";
		
		if (hora > 12) {
			str = "P";
		}else {
			str = "A";
		}
		
		System.out.println("Digite os minutos : ");
		int minutos = scan.nextInt();
	
		
		hora  = Funcoes.converter(hora);
		
		System.out.println(Funcoes.mostrarHora(hora, minutos, str));
		
		scan.close();

	}

}
