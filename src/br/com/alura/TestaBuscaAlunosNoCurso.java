package br.com.alura;

import java.util.Map;
import java.util.Set;

public class TestaBuscaAlunosNoCurso {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando Coleções do java", "Paulo");

		javaColecoes.adiciona(new Aula("Trabalhando com Array", 21));
		javaColecoes.adiciona(new Aula("Criando um aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 21));

		Aluno a1 = new Aluno("Gabriel", 1254);
		Aluno a2 = new Aluno("Guilherme", 5568);
		Aluno a3 =  new Aluno("Gabriela", 99852);
		Aluno a4 =  new Aluno("Rafaela", 5568);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		javaColecoes.matricula(a4);
		
		System.out.println(javaColecoes.getAlunos());
		
		System.out.println("Quem é o aluno com matricula 99852");
		
		Aluno aluno = javaColecoes.buscaMatricula(5568);
		System.out.println("Aluno: " + aluno);
		
		Map<Integer, Set<Aluno>> matriculaParaAluno;
		
	}
}
