package questao1;

import java.util.Stack;

public class OrganizarEntrgas {
	private Stack<Caminhao> pilhaCaminhoes;

	public OrganizarEntrgas() {
		pilhaCaminhoes = new Stack<Caminhao>();
	}

	public void adicionarCaminhao(Caminhao caminhao) {
		pilhaCaminhoes.push(caminhao);
	}

	public Caminhao removerCaminhao() {
		return pilhaCaminhoes.pop();
	}

	public static void main(String[] args) {
		OrganizarEntrgas organizador = new OrganizarEntrgas();

		organizador.adicionarCaminhao(new Caminhao("Caminhao1", 2));
		organizador.adicionarCaminhao(new Caminhao("Caminhao2", 1));
		organizador.adicionarCaminhao(new Caminhao("Caminhao3", 3));

		while (!organizador.pilhaCaminhoes.isEmpty()) {
			Caminhao caminhao = organizador.removerCaminhao();
			System.out.println(
					"Caminhão: " + caminhao.getNome() + ", Nível de Criticidade: " + caminhao.getNivelCriticidade());
		}
	}
}