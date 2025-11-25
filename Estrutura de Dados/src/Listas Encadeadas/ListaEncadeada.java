public class ListaEncadeada<T> {

    private No<T> inicio;
    private No<T> fim;
    private int tamanho;

    public ListaEncadeada() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    public boolean isVazia() {
        return inicio == null;
    }

    public int getTamanho() {
        return tamanho;
    }

     public void append(T dado) {
        No<T> novo = new No<>(dado);

        if (isVazia()) {
            inicio = novo;
            fim = novo;
        } else {
            fim.setProximo(novo);
            fim = novo;
        }

        tamanho++;
    }

    public void prepend(T dado) {
        No<T> novo = new No<>(dado);

        if (isVazia()) {
            inicio = novo;
            fim = novo;
        } else {
            novo.setProximo(inicio);
            inicio = novo;
        }

        tamanho++;
    }

     public boolean buscar(T dado) {
        No<T> atual = inicio;

        while (atual != null) {
            if (atual.getDado().equals(dado)) {
                return true;
            }
            atual = atual.getProximo();
        }

        return false;
    }

    public boolean remover(T dado) {
        if (isVazia()) return false;

        // se for o primeiro
        if (inicio.getDado().equals(dado)) {
            inicio = inicio.getProximo();
            if (inicio == null) fim = null; 
            tamanho--;
            return true;
        }

        No<T> atual = inicio;
        No<T> anterior = null;

        while (atual != null && !atual.getDado().equals(dado)) {
            anterior = atual;
            atual = atual.getProximo();
        }

        if (atual == null) return false; // não achou

        anterior.setProximo(atual.getProximo());

        if (atual == fim) { 
            fim = anterior;
        }

        tamanho--;
        return true;
    }

    
    @Override
    public String toString() {
        if (isVazia()) return "Lista vazia";

        StringBuilder sb = new StringBuilder();
        No<T> atual = inicio;

        while (atual != null) {
            sb.append(atual.getDado()).append(" -> ");
            atual = atual.getProximo();
        }

        sb.append("null");
        return sb.toString();
    }
}
