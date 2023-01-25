package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int cterreno, lterreno;
	cterreno= teclado.nextInt();
	lterreno= teclado.nextInt();
	int areaterreno = cterreno*lterreno;
	
	int ccasa, lcasa;
	ccasa= teclado.nextInt();
	lcasa= teclado.nextInt();
	int areacasa = ccasa*lcasa;
	
	int sla=areaterreno - areacasa;
	int sla2= sla *100;
	int sla3= 100-(sla2/areaterreno);
	System.out.println(sla3);
	}

}
