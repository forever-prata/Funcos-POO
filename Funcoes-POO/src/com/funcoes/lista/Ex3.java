package com.funcoes.lista;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vet = new int[3];
		
		for (int i = 0; i < vet.length; i++) {
			System.out.println("Digite o número da posição "+(i+1));
			vet[i] = scan.nextInt();
		}
		
		System.out.println("A soma dos números é "+Funcoes.somar(vet[0], vet[1], vet[2]));
		
		scan.close();
		
	}

}
