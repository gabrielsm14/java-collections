package br.com.alura.praticando;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso1 {

	private String nome;
	private String instrutor;
	private List<Aula1> aulas = new LinkedList<Aula1>();
	private Set<Aluno1> alunos =  new HashSet<>();
	private Map<Integer, Aluno1> matriculaParaAluno = new HashMap<>();
	
	
	public Curso1(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}
	
	public String getInstrutor() {
		return instrutor;
	}
	
	public List<Aula1> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	
	public void adiciona(Aula1 aula) {
		this.aulas.add(aula);
	}
	
	public void matricula(Aluno1 aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
	}
	
	public Set<Aluno1> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}
	
	public int getTempoTotal() {
		return this.aulas.stream().mapToInt(Aula1::getTempo).sum();
	}
	
	@Override
	public String toString() {
		return "[Curso: " + this.nome + ", Tempo total: " + this.getTempoTotal() + ", Aula: [" + this.aulas + "]";
	}

	public boolean estaMatriculado(Aluno1 aluno) {
		return this.alunos.contains(aluno);
	}

	public Aluno1 bucaMatricula(int numero) {
		if(!matriculaParaAluno.containsKey(numero)) 
			throw new NoSuchElementException("Não existe essa matricula");
			return matriculaParaAluno.get(numero);
	}
	
}
