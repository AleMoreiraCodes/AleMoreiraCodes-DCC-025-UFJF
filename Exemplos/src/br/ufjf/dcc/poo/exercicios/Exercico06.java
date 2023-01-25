package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class Exercico06 {

	public static void main(String[] args) {
		String num;
		int litros, kms;
		num = JOptionPane.showInputDialog(null, "Digite o número de litros gastos: ");
		litros = Integer.parseInt(num);
		num = JOptionPane.showInputDialog(null, "Digite o número de kms viajados: ");
		kms = Integer.parseInt(num);
		float k = (float) kms/litros;
		JOptionPane.showMessageDialog(null, "Km/litros: " + k);
	}

}
