package questao2;

import java.util.Stack;

public class DesfazerStack {
    private Stack<Acao> stack;

    public DesfazerStack() {
        stack = new Stack<Acao>();
    }

    public void addAcao(Acao Acao) {
        stack.push(Acao);
    }

    public void desfazerLastAcao() {
        if (!stack.isEmpty()) {
            Acao lastAcao = stack.pop();
            lastAcao.desfazer();
        }
    }

    public boolean candesfazer() {
        return !stack.isEmpty();
    }

    public int getStackSize() {
        return stack.size();
    }

    public static void main(String[] args) {
        DesfazerStack desfazerStack = new DesfazerStack();

       
        desfazerStack.addAcao(new AddelementoAcao("elementoo 1"));
        desfazerStack.addAcao(new AddelementoAcao("elementoo 2"));
        desfazerStack.addAcao(new RemoveelementoAcao("elementoo 2"));

        desfazerStack.desfazerLastAcao(); 
        desfazerStack.desfazerLastAcao();

        System.out.println("Tamanho da pilha: " + desfazerStack.getStackSize()); 
    }
}

interface Acao {
    void desfazer();
}

class AddelementoAcao implements Acao {
    private String elemento;

    public AddelementoAcao(String elemento) {
        this.elemento = elemento;
    }

    public void desfazer() {
        System.out.println("Desfazendo adição do elementoo: " + elemento);
    }
}

class RemoveelementoAcao implements Acao {
    private String elemento;

    public RemoveelementoAcao(String elemento) {
        this.elemento = elemento;
    }

    public void desfazer() {
        
        System.out.println("Desfazendo remoção do elemento: " + elemento);
    }
}
