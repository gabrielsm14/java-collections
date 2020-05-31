package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
		
		Collection<String> alunos = new HashSet<>();
		alunos.add("Gabriel");
		alunos.add("Rodrigo");
		alunos.add("Guilherme");
		alunos.add("Miguel");
		alunos.add("Lucas");
		
		
		//boolean GabrielEstaMatriculado = alunos.contains("Gabriel");
		System.out.println(alunos.contains("Gabriel")); // verifica se o Gabriel está no set 
		
		System.out.println(alunos.size());
		
		// para cada aluno que eu tenho dentro dessa coleção que tenho que chama alunos
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
//		alunos.forEach(aluno -> {
//			System.out.println(aluno);
//		});
	
		System.out.println(alunos);
		
		List<String> alunosEmLista = new ArrayList<>(alunos);
		
		
		
	}
}
