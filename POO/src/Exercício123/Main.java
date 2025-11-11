package Exercício123;

public class Main {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        System.out.println("=====CALCULADORA=====");
        System.out.println("1 + 2 = " +  c.soma(1, 2));
        System.out.println("1.5 + 2.5 = "+ c.soma(1.5, 2.5));
        System.out.println("3 x 2 = "+ c.multiplica(3, 2));
        System.out.println("3.5 x 2.5 = "+ c.multiplica(3.5, 2.5));
        System.out.println("5 - 3 = "+ c.subtrai(5, 3));
        System.out.println("5.5 - 3.2 = "+ c.subtrai(5.5, 3.2));
        System.out.println("6 / 3 = "+ c.divide(6, 3));
        System.out.println("5.5 / 2.5 = "+ c.subtrai(5.5, 2.5));

      
    }
  }
