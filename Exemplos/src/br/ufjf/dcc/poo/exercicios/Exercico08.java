package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class Exercico08 {

	public static void main(String[] args) {
		String str;
		int idd;
		str = JOptionPane.showInputDialog(null, "Digite a sua idade: ");
		idd = Integer.parseInt(str);
		if(idd <= 3) {
			JOptionPane.showMessageDialog(null, "Bêbe");
		}else if(idd > 3 && idd <= 13) {
			JOptionPane.showMessageDialog(null, "Criança");
		}else if(idd > 13 && idd < 20) {
			JOptionPane.showMessageDialog(null, "Adolecente");
		}else if(idd >= 20 && idd < 65) {
			JOptionPane.showMessageDialog(null, "Adulto");
		}else {
			JOptionPane.showMessageDialog(null, "Idoso");
		}

	}

}
