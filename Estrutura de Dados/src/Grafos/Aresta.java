public class Aresta<T> {
    private Double peso;
    private Vertice<T> inicio;
    private Vertice<T> fim;

    public Aresta(Vertice<T> fim, Vertice<T> inicio, Double peso) {
        this.fim = fim;
        this.inicio = inicio;
        this.peso = peso;
    }


    public Double getPeso() {
        return peso;
    }
    public void setPeso(Double peso) {
        this.peso = peso;
    }
    public Vertice<T> getInicio() {
        return inicio;
    }
    public void setInicio(Vertice<T> inicio) {
        this.inicio = inicio;
    }
    public Vertice<T> getFim() {
        return fim;
    }
    public void setFim(Vertice<T> fim) {
        this.fim = fim;
    }

    
}
