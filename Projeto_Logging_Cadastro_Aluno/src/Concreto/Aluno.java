package Concreto;

import Abstrata.Pessoa;

public class Aluno extends Pessoa {
	int ra;

	

	public Aluno(String nome, String cpf, int idade, int ra) {
		super(nome, cpf, idade);
		this.ra = ra;
	}

	public int getRa() {
		return ra;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}
	
	public void correr() {
		System.out.println(this.getNome() + "estudando");
	}
	
	
}
