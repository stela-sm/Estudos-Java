package Exercicio117;

/* Enunciado:

Criar um Sistema de Transporte
Você vai criar um sistema simples que simula diferentes tipos de transporte. Teremos uma superclasse chamada Transporte e várias subclasses como Carro, Bicicleta e Avião. Cada transporte terá uma implementação diferente para o método mover().
Além disso, você deve criar uma classe principal para demonstrar o polimorfismo, onde um Transporte será percorrido, e o método mover() será chamado para cada tipo de transporte.

Instruções:

 I.         Crie uma superclasse Transporte com um método abstrato mover().

  II.         Crie as subclasses Carro, Bicicleta e Avião que estendem a classe Transporte e implementam o método mover()de maneiras diferentes.

  III.         Na classe principal, crie um objeto de Transporte que contenha instâncias de Carro, Bicicleta e Avião. Em seguida, chame o método mover() para cada objeto.

  IV.         Exiba as mensagens de movimentação correspondentes no console.
 */

public class Main {
    public static void main(String[] args) {
        
    Carro c = new Carro();
    Bicicleta b = new Bicicleta();
    Aviao a = new Aviao();
        
    System.out.println(c.mover());
    System.out.println(b.mover());
    System.out.println(a.mover());

}
    
}
