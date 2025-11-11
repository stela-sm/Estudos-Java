package Exercício122;

//Crie uma hierarquia de classes de veículos(Carro,Moto,Caminhão)que implementem um método acelerar() de forma polimórfica.

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Moto moto = new Moto();
        Caminhao caminhao = new Caminhao();

        System.out.println(carro.acelerar());
        System.out.println(moto.acelerar());
        System.out.println(caminhao.acelerar());
        
    }
}
