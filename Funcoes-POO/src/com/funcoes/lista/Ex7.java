package com.funcoes.lista;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float valor = 0;
		int atraso = 0;
		float total = 0;
		int count = 0;
		
		do {
			System.out.println("Digite o valor da prestação");
			valor = scan.nextFloat();
			
			if (valor!=0) {
				System.out.println("Digite os dias em atraso");
				atraso = scan.nextInt();
				
				System.out.println(Funcoes.valorPagamento(valor, atraso));
				
				total += Funcoes.valorPagamento(valor, atraso);
				
				count++;
			}
		} while (valor != 0);
		
		System.out.println(count+" Prestações pagas no dia");
		System.out.println("Total pago no dia = "+total);
		
		scan.close();

	}

}
