package br.ufjf.dcc.poo.exemplos;

import javax.swing.JOptionPane;

public class exemplo02Dialog {

	public static void main(String[] args) {
		String num;
		int a, b, soma; 
		num = JOptionPane.showInputDialog(null, "Digite um valor: ");
		a = Integer.parseInt(num);
		num = JOptionPane.showInputDialog(null, "Digite um valor: ");
		b = Integer.parseInt(num);
		soma = a + b;
		JOptionPane.showMessageDialog(null,"Total: " + soma);

	}

} 
