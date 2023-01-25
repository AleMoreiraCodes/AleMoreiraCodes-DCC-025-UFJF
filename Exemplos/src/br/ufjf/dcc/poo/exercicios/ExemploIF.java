package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class ExemploIF {

	public static void main(String[] args) {
		String str;
		double num;
		str = JOptionPane.showInputDialog(null, "Digite um número: ");
		num = Double.parseDouble(str);
		if(num < 0)
			num = -num;
		JOptionPane.showMessageDialog(null, "Modulo do numero: " + num);
	}

}
