
public class Fila<T> {
    private No<T> inicio;
    private No<T> fim;

    public Fila() {
        this.inicio = null;
        this.fim = null;
    }


    public void push(T valor){
        No<T> novo = new No<T>(null, valor);

        if (this.inicio == null) {
            // fila vazia
            this.inicio = novo;
            this.fim = novo;
        } else {
            // já existe pelo menos 1
            this.fim.setProximo(novo);
            this.fim = novo;
        }
    }

    public T pop(){
        if(this.inicio == null){
            return null; 
        }
        T valor = this.inicio.getValor();
        this.inicio = this.inicio.getProximo();

            if (this.inicio == null) {
             this.fim = null; // agora a fila ficou vazia
            }

    return valor;
    }
}
