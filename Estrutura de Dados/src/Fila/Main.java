public class Main {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();
        
        fila.push(10);
        fila.push(20);
        fila.push(30);

        System.out.println(fila.pop());
    }
}
