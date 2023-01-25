package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int ini, fim;
		System.out.println("Digite o inicio da sequência: ");
		ini = teclado.nextInt();
		System.out.println("Digite o fim da sequência: ");
		fim = teclado.nextInt();
		System.out.print("Sequência: ");
		for(int i = ini+1; i < fim; i++) {
			System.out.print( i + " ");
		}
	}

}
