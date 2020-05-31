package br.com.alura.praticando;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.alura.Aula;
import br.com.alura.Curso;

public class TestaCurso2 {

	public static void main(String[] args) {
		
		Curso1 java = new Curso1("Dominando coleçoes ", "Gabriel");
		
		
		java.adiciona(new Aula1("Trabalando com lista", 22));
		java.adiciona(new Aula1("Criando Objetos", 12));
		java.adiciona(new Aula1("Modelando", 10));

		
		List<Aula1> aulasImutaveis = java.getAulas();
		System.out.println(aulasImutaveis);
		
		List<Aula1> aulas = new ArrayList<>(aulasImutaveis);
		Collections.sort(aulas);
		System.out.println(aulas);
		
		System.out.println(java.getTempoTotal());
		
		System.out.println(java);
		
	}
}
