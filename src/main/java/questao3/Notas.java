package questao3;

import java.util.Stack;

public class Notas {
    private Stack<String> notas;

    public Notas() {
        notas = new Stack<String>();
    }

    public void adicionarNota(String nota) {
        notas.push(nota);
    }

    public void exibirNotas() {
        while (!notas.empty()) {
            System.out.println(notas.pop());
        }
    }

    public static void main(String[] args) {
        Notas app = new Notas();
        app.adicionarNota("Nota 1");
        app.adicionarNota("Nota 2");
        app.adicionarNota("Nota 3");

        System.out.println("Notas em ordem inversa:");
        app.exibirNotas();
    }
}
