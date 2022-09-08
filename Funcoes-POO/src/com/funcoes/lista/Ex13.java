package com.funcoes.lista;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o tamanho das colunas");
		int colunas = scan.nextInt();
		
		System.out.println("Digite o tamanho das linhas");
		int linhas = scan.nextInt();
		
		if (colunas < 1 || colunas > 20) {
			colunas = 5;
		}
		
		if (linhas < 1 || linhas > 20) {
			linhas = 5;
		}
		
		System.out.println(Funcoes.desenhar(colunas, linhas));
		
		scan.close();

	}

}
