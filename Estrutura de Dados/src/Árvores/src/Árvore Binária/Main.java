public class Main {
    public static void main(String[] args) {
        ArvoreBinariaBuca<Integer> bst = new ArvoreBinariaBuca<>();

        int[] valores = {50,30,70,20,40,60,80};
        for(int v : valores){
            bst.inserir(v);
        }

        bst.imprimirEmOrdem();
        bst.imprimirPreOrdem();
        bst.imprimirPosOrdem();
    }
}
