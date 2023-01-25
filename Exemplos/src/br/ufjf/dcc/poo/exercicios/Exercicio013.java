package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class Exercicio013 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n;
		int acm = 0;
		int cont = 0;
		System.out.println("Digite um valor: ");
		n = teclado.nextInt();
		while(n != -1) {
			acm += n;
			cont++;
			System.out.println("Digite um valor: ");
			n = teclado.nextInt();
		}
		System.out.println("Média: " + acm/cont);
	}

}
