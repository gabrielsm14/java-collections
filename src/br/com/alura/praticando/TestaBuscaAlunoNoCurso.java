package br.com.alura.praticando;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class TestaBuscaAlunoNoCurso {

	public static void main(String[] args) {

		Curso1 java = new Curso1("Dominando coleções", "Gabriel");
//		
//		java.adiciona(new Aula1("Trabalhando com listas", 22));
//		java.adiciona(new Aula1("Criando Objetos", 12));
//		java.adiciona(new Aula1("Modelando", 10));
//		
//		Aluno1 a1 = new Aluno1("Guilherme", 55666);
//		Aluno1 a2 = new Aluno1("Gabriela", 22222);
//		Aluno1 a3 = new Aluno1("Rafael", 56544);
//		
//		java.matricula(a1);
//		java.matricula(a2);
//		java.matricula(a3);
//		
//		System.out.println(java.getAlunos());
//		
//		System.out.println(java.bucaMatricula(56544));

//		Map<Integer, String> pessoas = new HashMap<>();
//
//		pessoas.put(21, "Leonardo Cordeiro");
//		pessoas.put(27, "Fabio Pimentel");
//		pessoas.put(19, "Silvio Mattos");
//		pessoas.put(23, "Romulo Henrique");
//
//		pessoas.keySet().forEach(idade -> {
//			System.out.println(pessoas.get(idade));
//		});
//
//		for (Integer key : pessoas.keySet()) {
//			System.out.println(key + " - " + pessoas.get(key));
//		}

		Map<String, Integer> nomesParaIdade = new HashMap<>();
		nomesParaIdade.put("Paulo", 31);
		nomesParaIdade.put("Adriano", 25);
		nomesParaIdade.put("Alberto", 33);
		nomesParaIdade.put("Guilherme", 26);
		
		Set<String> chaves = nomesParaIdade.keySet();
		for (String nome : chaves) {
			System.out.println(nome);
		}
		
		Collection<Integer> valores = nomesParaIdade.values();
		for (Integer idade : valores) {
			System.out.println(idade);
		}
		
		Set<Entry<String, Integer>> associacoes = nomesParaIdade.entrySet();
		for (Entry<String, Integer> associacao : associacoes) {
			System.out.println(associacao.getKey() + " - " + associacao.getValue());
		}

	}
}
