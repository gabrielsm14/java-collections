package br.com.alura.praticando;

import java.util.Collections;
import java.util.Set;
import br.com.alura.Aluno;

public class TestaCursoComAluno1 {

	public static void main(String[] args) {
		
		Curso1 java = new Curso1("Dominando coleções", "Gabriel");
		
		java.adiciona(new Aula1("Trabalhando com listas", 22));
		java.adiciona(new Aula1("Criando Objetos", 12));
		java.adiciona(new Aula1("Modelando", 10));
		
		Aluno1 a1 = new Aluno1("Guilherme", 55666);
		Aluno1 a2 = new Aluno1("Gabriela", 22222);
		Aluno1 a3 = new Aluno1("Rafael", 56544);
		
		java.matricula(a1);
		java.matricula(a2);
		java.matricula(a3);
		
		java.getAlunos().forEach(aluno -> {
			System.out.println(aluno);
		});
		
		
		System.out.println(java.estaMatriculado(a1));
		
		Aluno1 gabriel = new Aluno1("Gabriel",1254);
		System.out.println("E esse gabriel, esta matriculado?");
		System.out.println(java.estaMatriculado(gabriel));

		System.out.println("O a1 é equals a gabriel?");
		System.out.println(a1.equals(gabriel));
		
		// se eu tenho dois objetos que são equals, obrigatoriamente o seguinte é true:
		
		System.out.println(a1.hashCode() == gabriel.hashCode());
	
		
    }
		 
}

