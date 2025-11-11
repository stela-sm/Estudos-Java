package Exercício90;

public class FuncionarioPJ extends Funcionario {
    private double valor_hora;
    private int horas_trabalhadas;

    FuncionarioPJ(double valor_hora, int horas_trabalhadas, String nome, int matricula){
        this.valor_hora = valor_hora;
        this.horas_trabalhadas = horas_trabalhadas;
        super.setNome(nome);
        super.setMatricula(matricula);
    }

    public double calcularSalario(){
        return this.horas_trabalhadas * this.valor_hora;

    }

    public String toString() {
        return "Nome: " + super.getNome()
                +
                "\nMatrícula: " + super.getMatricula()
                +
                "\nSalário: " + this.calcularSalario();
    }
}
