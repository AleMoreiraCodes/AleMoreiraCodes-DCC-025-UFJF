package br.ufjf.dcc.poo.exemplos;

public class Principal {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		
		pessoa1.cpf = "001.542.876-52";
		pessoa1.idade = 18;
		pessoa1.sexo = "Feminino";
		pessoa1.nome = "Ricardin da 12";
		
		pessoa2.cpf = "009.637.836-34";
		pessoa2.idade = 35;
		pessoa2.sexo = "Masculino";  
		pessoa2.nome = "Mia Regazza";
		
		Funcionario funcionario = new Funcionario();
		funcionario.nome = "Tio da Limp";
		funcionario.cargo = "Faxineiro";
		funcionario.matricula = "123456";
		
		Aluno aluno = new Aluno();
		aluno.nome = "Fulano";
		aluno.curso = "Letras";
		aluno.registro = "L6478";
				
		Professor professor = new Professor();
		professor.nome = "Claudinho";
		professor.matricula = "837384";
		professor.NumAulas = 20;
		
		
		
	}

}










