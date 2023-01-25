package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;


public class exercicio3 {
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		float a,b,c;
		a= teclado.nextFloat();
		b= teclado.nextFloat();
		c= teclado.nextFloat();
		float delta = (b*b)-(4*a*c);
		double x1 = (-b + Math.sqrt(delta))/(2*a);
		System.out.println(x1);
	}

}
