package com.funcoes.lista;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int result = Funcoes.jogar();
		
		System.out.println("Digite para jogar");
		scan.next();
		
		System.out.println("Pontuação = ");
		System.out.println(result);;
		
		if (result == 7 || result ==11) {
			System.out.println("Você ganhou");
		}else if(result == 2 || result ==3 || result ==12){
			System.out.println("CRAPS");
		}else {
			int ponto = result;
			do {
				System.out.println("Digite para jogar denovo");
				scan.next();
				
				result = Funcoes.jogar();
				
				System.out.println("Pontuação = ");
				System.out.println(result);;
			} while (result != 7 && result != ponto);
			
			if (ponto == result) {
				System.out.println("Você ganhou");
			}else {
				System.out.println("CRAPS");
			}
		}		
		scan.close();
		
	}

}
