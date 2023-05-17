package questao1;

class Caminhao {
	private String nome;
	private int nivelCriticidade;

	public Caminhao(String nome, int nivelCriticidade) {
		this.nome = nome;
		this.nivelCriticidade = nivelCriticidade;
	}

	public String getNome() {
		return nome;
	}

	public int getNivelCriticidade() {
		return nivelCriticidade;
	}
}
