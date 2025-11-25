public class Main {
    public static void main(String[] args) {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.append(10);
        lista.append(20);
        lista.append(30);
        lista.prepend(5);

        System.out.println(lista); 

        lista.remover(20);

        System.out.println(lista); 
    }
}
