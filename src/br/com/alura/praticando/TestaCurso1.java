package br.com.alura.praticando;

import java.util.List;

public class TestaCurso1 {

	public static void main(String[] args) {
		
		Curso1 java = new Curso1("Dominando coleçoes ", "Gabriel");
		
		List<Aula1> aulas = java.getAulas();
		System.out.println(aulas);
		
		java.adiciona(new Aula1("Trabalando com lista", 22));
		java.adiciona(new Aula1("Criando Objetos", 12));

		System.out.println(aulas);
		
	}
}
