package br.com.alura.praticando;

import java.util.ArrayList;
import java.util.Collections;

public class TreinoLista1 {

	public static void main(String[] args) {

		String curso1 = "java";
		String curso2 = " flutter";
		String curso3 = "banco de dados";

		ArrayList<String> cursos = new ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);

		System.out.println(cursos);

		cursos.remove(1);
		System.out.println(cursos);

		System.out.println("Nome do primeiro curso " + cursos.get(0));

		for (int i = 0; i <= cursos.size(); i++) {
			System.out.println("Aula: " + cursos.get(1));
		}

		Collections.sort(cursos);
		System.out.println(cursos);

	}
}
