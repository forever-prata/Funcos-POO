package com.funcoes.lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Funcoes {
	
	//Ex1
	public static String imprimir(int num) {
		StringBuilder saida = new StringBuilder();
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < i+1; j++) {
				saida.append((i+1));
				saida.append(" ");
			}
			saida.append("\n");
		}
		
		return saida.toString();
	}
	
	//Ex2
	public static String imprimirSomando(int num) {
		StringBuilder saida = new StringBuilder();
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < i+1; j++) {
				saida.append((j+1));
				saida.append(" ");
			}
			saida.append("\n");
		}
		
		return saida.toString();
	}
	
	//Ex3
	public static int somar(int x, int y , int z) {
		int soma = x+y+z;
		
		return soma;
	}
	
	//Ex4
	public static String identificar(int num) {
		
		String str = "";
		
		if (num > 0) {
			str = "P";
		}else {
			str = "N";
		}
		
		return str;
	}
	
	//Ex5
	public static float somaImposto(int imposto, float custo) {
		
		float novoCusto = custo + (float)(custo*((float)imposto/100));
		return novoCusto;
	}
	
	//Ex6
	public static int converter(int hora) {
		
		if (hora> 12) {
			hora = hora-12;
		}
		return hora;
	}
	
	//Ex6
		public static String mostrarHora(int hora, int minutos, String str) {
			StringBuilder saida = new StringBuilder();
			
			saida.append((hora));
			saida.append(":");
			saida.append(minutos);
			
			if (str.equals("A")) {
				saida.append(" AM");
			}else {
				saida.append(" PM");
			}
			
			return saida.toString();
			
		}
		
		//Ex7
		public static float valorPagamento(float valor, int atraso) {
			
			float valorF = 0;
			
			if (atraso == 0) {
				valorF = valor;
			}else {
				valorF = (float) (valor + (valor*0.03) + valor*(0.001*atraso));
			}
			
			return valorF;
		}
		
		//Ex8
		public static int digitos(int num) {
			
			StringBuilder saida = new StringBuilder();
			saida.append(num);
			
			return saida.length();
			
		}
		
		//Ex9
		public static StringBuilder reverse(int num) {
			
			StringBuilder saida = new StringBuilder();
			saida.append(num);
			
			return saida.reverse();
			
		}
		
		//Ex10
		public static int jogar() {
			Random gerador = new Random();
			
			int x = gerador.nextInt(7)+1;
			int y = gerador.nextInt(7)+1;
			
			int soma = x+y;
			
			return soma;
			
		}
		
		//Ex11
		public static String data(String str) {
			
			String array[] = new String[3];
			int num[] = new int[3];
			StringBuilder saida = new StringBuilder();
			
			array = str.split("/");
			
			for(int i = 0 ; i < num.length; i++) {
				num[i] = Integer.parseInt(array[i]);
			}
			
			if (num[0]<=0 || num[1]<=0 || num[2]<=0) {
				saida.append("NULL");
			}else {
				saida.append(array[0]);
				saida.append(" De ");
				saida.append(array[2]);
			}
			return saida.toString();
			
		}
		
		//Ex12
		public static String embaralha(String str) {
			
			String array[] = new String[str.length()];
			
			ArrayList<String> mylist = new ArrayList<String>();
			
			array = str.split("");
			
			
			for (int i = 0; i < array.length; i++) {
				mylist.add(array[i].toLowerCase());
			}
			
			Collections.shuffle(mylist);
			
			return mylist.toString();
		}
		
		//Ex13
		public static String desenhar(int colunas, int linhas) {
			
			StringBuilder saida = new StringBuilder();
			
			for (int i = 0; i < linhas; i++) {
				
				if (i == 0||i == linhas-1) {
					saida.append("+");
				}else {
					saida.append("|");
				}
				
				
				for (int j = 0; j < colunas; j++) {
					saida.append("-");
				}
				
				
				if (i == 0||i == linhas-1) {
					saida.append("+");
				}else {
					saida.append("|");
				}
				
				saida.append("\n");
			}
			
			return saida.toString();
			
		}
}
