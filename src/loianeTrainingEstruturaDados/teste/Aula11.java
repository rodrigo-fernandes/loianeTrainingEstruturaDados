package loianeTrainingEstruturaDados.teste;

import loianeTrainingEstruturaDados.Contato;
import loianeTrainingEstruturaDados.Lista;
import loianeTrainingEstruturaDados.VetorObjetos;

public class Aula11 {

	public static void main(String[] args) {

		Lista<Contato> vetor = new Lista<Contato>(1);

		Contato c1 = new Contato("Contato 1", "1234-567", "contato1@email.com");
		Contato c2 = new Contato("Contato 2", "1234-567", "contato1@email.com");
		Contato c3 = new Contato("Contato 3", "1234-567", "contato1@email.com");

		vetor.adiciona(c1);
	}

}
