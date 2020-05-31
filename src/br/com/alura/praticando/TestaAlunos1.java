package br.com.alura.praticando;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos1 {

	public static void main(String[] args) {
		
		Set<String> alunos = new HashSet<>();
		alunos.add("Gabriel");
		alunos.add("Rodrigo");
		alunos.add("Guilherme");
		alunos.add("Miguel");
		alunos.add("Lucas");
		
		System.out.println(alunos.size());
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
	}
}
