package Exercício90;

/*Enunciado: Exercício 90: Sistema de Funcionários

Crie uma classe abstrata Funcionario com:

·Atributos:nome,matricula
·Método abstrato:calcularSalario()
·Método concreto:getNome(),getMatricula()

Crie duas subclasses:

1. FuncionarioCLT que implementa calcularSalario()com um salário fixo
2. FuncionarioPJ que implementa calcularSalario()com um valor por hora*horas trabalhadas*/

public abstract class Funcionario {
    private String nome;
    private int matricula;
    public abstract int calcularSalario();
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
}
