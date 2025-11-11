package Exercício90;

/*Enunciado: Exercício 90: Sistema de Funcionários

Crie uma classe abstrata Funcionario com:

·Atributos:nome,matricula
·Método abstrato:calcularSalario()
·Método concreto:getNome(),getMatricula()

Crie duas subclasses:

1. FuncionarioCLT que implementa calcularSalario()com um salário fixo
2. FuncionarioPJ que implementa calcularSalario()com um valor por hora*horas trabalhadas*/


public class Main {

    public static void main(String[] args) {
        
    
    FuncionarioCLT fCLT = new FuncionarioCLT(1580.90, "Bia", 18272);
    FuncionarioPJ fPJ = new FuncionarioPJ(6.89, 58, "Ana", 723782);
    System.out.println("\n=====Funcionário CLT=====");
    System.out.println(fCLT.toString());
    System.out.println("\n=====Funcionário PJ=====");
    System.out.println(fPJ.toString());
    }
}
