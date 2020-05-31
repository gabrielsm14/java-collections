package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {

		String aula1 = "Conhecemdno mais listas";
		String aula2 = "Modelando a classe aula";
		String aula3 = "Trabalhando com cursos e sets";

		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		System.out.println(aulas);

		aulas.remove(0);

		System.out.println(aulas);

		for (String aula : aulas) { // para cada String aula dentro de aulas faça...
			System.out.println("Aula: " + aula);
		}

		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula é " + primeiraAula);

		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("Aula: " + aulas.get(i));
		}

		aulas.forEach(aula -> {
			System.out.println("percorrendo:");
			System.out.println("Aula " + aula);
		});
		
		
		aulas.add("Aumentando conhecimento");
		System.out.println(aulas);
		
		Collections.sort(aulas);
		System.out.println("depois de ordenado");
		System.out.println(aulas);

	}
}
