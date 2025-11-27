public class ArvoreBinariaBuca<T extends Comparable<T>>{
    private No<T> raiz;
    public void inserir(T valor){
        raiz = inserirRec(raiz, valor);
    }

    private No<T> inserirRec(No<T> atual, T valor){
        if(atual == null) return new No<>(valor);

        int cmp = valor.compareTo(atual.valor);
        if(cmp < 0){
            atual.esquerda = inserirRec(atual.esquerda, valor);
        }else if (cmp > 0){
            atual.direita = inserirRec(atual.direita, valor);

        }

        return atual;
    }

    public void imprimirEmOrdem(){
        System.out.print("Em ordem: ");
        emOrdemRec(raiz);
        System.out.println();
    }

    private void emOrdemRec(No<T> no){
        if(no == null) return;
        emOrdemRec(no.esquerda);
        System.out.println(no.valor+" ");
        emOrdemRec(no.direita);
    }
    public void imprimirPreOrdem(){
        System.out.println("Pré-ordem: ");
        preOrdemRec(raiz);
        System.out.println();
    }
    private void preOrdemRec(No<T> no){
        if(no == null) return;
        System.out.println(no.valor + " ");
        preOrdemRec(no.esquerda);
        preOrdemRec(no.direita);
    }
    public void imprimirPosOrdem(){
        System.out.println("Pós-ordem: ");
        posOrdemRec(raiz);
        System.out.println();
    }

    private void posOrdemRec(No<T> no){
        if(no==null) return;
        posOrdemRec(no.esquerda);
        posOrdemRec(no.direita);
        System.out.println(no.valor + " ");
    }
}
