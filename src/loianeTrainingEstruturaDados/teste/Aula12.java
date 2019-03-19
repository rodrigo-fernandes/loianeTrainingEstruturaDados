package loianeTrainingEstruturaDados.teste;

import java.util.ArrayList;

public class Aula12 {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>();

		arrayList.add("A");
		arrayList.add("C");

		System.out.println(arrayList);

		// adiciona na posi��o desejada
		arrayList.add(1, "B");

		System.out.println(arrayList);

		// M�todo de busca
		boolean existe = arrayList.contains("A"); // UTILIZA O CONTAINS
		if (existe) {
			System.out.println("Elemento existe no array");
		} else {
			System.out.println("Elemento n�o existe no array");
		}

		// Busca a posi��o que o elemento est� no vetor
		int pos = arrayList.indexOf("A"); // retorna o indece em que o objeto esta
		if (pos > -1) {
			System.out.println("Elemento existe no arrau na pos " + pos);
		} else {
			System.out.println("Elemento n�o existe no arrau na pos " + pos);
		}

		// busca por posi��o
		System.out.println(arrayList.get(2));

		// met�do para remover/excluir
		arrayList.remove(0); // remove o indica
		arrayList.remove("B"); // remove o objeto

		// tamanho do vetor/array
		System.out.println(arrayList.size());

	}

}
