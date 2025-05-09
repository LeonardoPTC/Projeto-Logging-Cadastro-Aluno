package main;


import java.util.logging.Level;
import java.util.logging.Logger;

import Concreto.Aluno;

public class Main {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(Main.class.getName());
		
		Aluno p1 = new Aluno("Aluno 1", "11111111111", 16, 1212);
		
		logger.log(Level.INFO, p1.getNome() + " Criado\n");
		
		Aluno p2 = new Aluno("Aluno 2", "22222222222", 15, 1321);
		
		logger.log(Level.INFO, p2.getNome() + " Criado\n");
		
		Aluno p3 = new Aluno("Aluno 3", "33333333333", 17, 3212);
		
		logger.log(Level.INFO, p3.getNome() + " Criado");
		
	}

}
