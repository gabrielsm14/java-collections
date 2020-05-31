package br.com.alura.praticando;

import br.com.alura.Aluno;

public class Aluno1 {

	private String nome;
	private int numeroMatricula;

	public Aluno1(String nome, int numeroMatricula) {
		if(nome == null) {
			throw new NullPointerException("Não pode ser null");
		}
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	
	@Override
	public boolean equals(Object obj) {
		Aluno1 outro = (Aluno1) obj;
		return this.nome.equals(outro.nome);
	}
	
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}
	
	@Override
	public String toString() {
		return "[Aluno: " + this.nome + ", matricula: " + this.numeroMatricula + "]";
	}
	

}
