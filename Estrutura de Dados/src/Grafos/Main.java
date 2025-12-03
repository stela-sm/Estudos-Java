public class Main {
    public static void main(String[] args) {
        Grafo<String> grafo = new Grafo<String>();
        grafo.adicionarVertice("João");
        grafo.adicionarVertice("Lorenzo");

        grafo.adicionarAresta("João", "Lorenzo", 2.00);

        
    }
}
