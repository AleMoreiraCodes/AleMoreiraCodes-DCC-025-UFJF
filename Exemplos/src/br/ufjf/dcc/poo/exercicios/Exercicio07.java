package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class Exercicio07 {

	public static void main(String[] args) {
		int numSorteado = (int) (Math.random()*10);	
		String str;
		int num;
		str = JOptionPane.showInputDialog(null, "Digite um número: ");
		num = Integer.parseInt(str);
		if(num == numSorteado)
			JOptionPane.showMessageDialog(null, "Os números são iguais! Numero sorteado: " + numSorteado);
		else if(num > numSorteado)
			JOptionPane.showMessageDialog(null, "O número sorteado é menor! Numero sorteado: " + numSorteado);
		else if(num < numSorteado)
			JOptionPane.showMessageDialog(null, "O número sorteado é maior! Numero sorteado: " + numSorteado);
		
	}

}
