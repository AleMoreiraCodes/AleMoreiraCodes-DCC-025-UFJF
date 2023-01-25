package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class exercicio05Dialog {

	public static void main(String[] args) {
		String num;
		double x1, x2, y1, y2, result, k;
		num = JOptionPane.showInputDialog(null, "Digite o valor de x1: ");
		x1 = Double.parseDouble(num);
		num = JOptionPane.showInputDialog(null, "Digite o valor de x2: ");
		x2 = Double.parseDouble(num);
		num = JOptionPane.showInputDialog(null, "Digite o valor de y1: ");
		y1 = Double.parseDouble(num);
		num = JOptionPane.showInputDialog(null, "Digite o valor de y2: ");
		y2 = Double.parseDouble(num);
		k = ((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
		result = Math.sqrt(k);
		JOptionPane.showMessageDialog(null, result);
	}

}
