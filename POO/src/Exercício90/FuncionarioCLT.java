package Exercício90;

public class FuncionarioCLT extends Funcionario{
   private double salario;

   FuncionarioCLT(double salario, String nome, int matricula){
    this.salario = salario;
    super.setNome(nome);
    super.setMatricula(matricula);
   }

   @Override
   public double calcularSalario(){
    return this.salario;
   }

   @Override
   public String toString(){
    return 
    "Nome: " + super.getNome()
    +
    "\nMatrícula: " + super.getMatricula()
    +
    "\nSalário: " + this.calcularSalario();
   }
    
}
