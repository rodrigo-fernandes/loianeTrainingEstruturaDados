package loianeTrainingEstruturaDados;

public class VetorObjetos {

	private Object[] elementos;
	private int tamanho;

	public VetorObjetos(int capacidade) {
		this.elementos = new Object[capacidade];
		this.tamanho = 0;
	}

	public boolean adiciona(Object elemento) {
		this.aumentaCapacidade();
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;

			return true;
		}
		return false;
	}

	// Algoritmo que INSERI ELEMENTO em qualquer posi��o do Vetor
	// 0 1 2 3 4 5 6 = tamanho � 5
	// B C E F G + +
	//
	public boolean adiciona(int posicao, Object elemento) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posi��o inv�lida!");
		}

		this.aumentaCapacidade();

		// mover todos os elementos
		for (int i = this.tamanho - 1; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;

		return true;
	}

	// Dobra a capacidade do vetor
	private void aumentaCapacidade() {
		if (this.tamanho == this.elementos.length) {
			Object[] elementosNovos = new Object[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}

	public Object busca(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posi��o inv�lida!");
		}

		return this.elementos[posicao];
	}

	// Algoritimo de BUSCA SEQUENCIAL
	public int busca(Object elemento) {
		for (int i = 0; i < this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}

		return -1;
	}

	// Remove o elemento do vetor
	// B D E F F -> posi��o a ser removida � 1 (g)
	// 0 1 2 3 4 -> tamanho � 5
	// vetor[1] = vetor[2]
	// veor[2] = vetor[3]
	// vetor[3] = vetor[4]
	public void remove(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posi��o inv�lida!");
		}
		for (int i = posicao; i < this.tamanho - 1; i++) {
			this.elementos[i] = this.elementos[i + 1];
		}
		this.tamanho--;
	}

	public int tamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {

		StringBuilder s = new StringBuilder();
		s.append("[");

		for (int i = 0; i < this.tamanho - 1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}

		if (this.tamanho > 0) {
			s.append(this.elementos[this.tamanho - 1]);
		}

		s.append("]");

		return s.toString();
	}

}
