package br.com.alura;

import java.util.Set;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando Coleções do java", "Paulo");

		javaColecoes.adiciona(new Aula("Trabalhando com Array", 21));
		javaColecoes.adiciona(new Aula("Criando um aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 21));

		Aluno a1 = new Aluno("Gabriel", 1254);
		Aluno a2 = new Aluno("Guilherme", 5568);
		Aluno a3 =  new Aluno("Gabriela", 99852);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Todos os alunos matriculados");
		
		Set<Aluno> alunos = javaColecoes.getAlunos();
		
		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		});
		
//		Iterator<Aluno> iterador = alunos.iterator();
//		while(iterador.hasNext()) {
//			Aluno proximo = iterador.next();
//			System.out.println(proximo);
//		}
		
//		for(Aluno a : javaColecoes.getAlunos()) {
//			System.out.println(a);
//		}
		
//		Set<Aluno> alunos = javaColecoes.getAlunos();
		
		System.out.println("O aluno " + a1 + " esta matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		Aluno gabriel = new Aluno("Gabriel",1254);
		System.out.println("E esse gabriel, esta matriculado?");
		System.out.println(javaColecoes.estaMatriculado(gabriel));

		System.out.println("O a1 é equals a gabriel?");
		System.out.println(a1.equals(gabriel));
		
		// se eu tenho dois objetos que são equals, obrigatoriamente o seguinte é true:
		
		System.out.println(a1.hashCode() == gabriel.hashCode());
		
		
		
	}
}
