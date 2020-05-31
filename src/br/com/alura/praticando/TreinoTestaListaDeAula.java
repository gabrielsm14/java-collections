package br.com.alura.praticando;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import br.com.alura.Aula;

public class TreinoTestaListaDeAula {

	public static void main(String[] args) {
	
	Aula1 a1 = new Aula1("java", 25);
	Aula1 a2 = new Aula1("Banco de dados", 20 );
	Aula1 a3 = new Aula1("Flutter", 15);
	
	
	ArrayList<Aula1> aulas = new ArrayList<>();
	aulas.add(a1);
	aulas.add(a2);
	aulas.add(a3);
	
	System.out.println(aulas);
	/**
	 * collection.short() -> colocar em ordem alfabetica, precisei implementar Comparable na class e acrescentar o metodo ComparaTo
	 */
	 Collections.sort(aulas);
	System.out.println(aulas);
	
	aulas.sort(Comparator.comparing(Aula1 :: getTempo)); // commpara o tempo menor para o maior 
	System.out.println(aulas);
	

	
	}
}
