package loianeTrainingEstruturaDados.teste;

import loianeTrainingEstruturaDados.Vetor;

public class Aula5 {

	public static void main(String[] args) {

		Vetor vetor = new Vetor(10);
		
		vetor.adiciona("elemento 1");
		vetor.adiciona("elemento 2");
		vetor.adiciona("elemento 3");
		
		System.out.println(vetor.busca(0));
		System.out.println(vetor.busca(55));
		
	}

}
