package secondsemester.listexercises;

public class Funcionario {
    private double salario;

    // Construtor
    public Funcionario(double salario) {
        this.salario = salario;
    }

    // Método para calcular o imposto baseado na faixa de rendimento
    public double calcularImposto() {
        double imposto;
        if (salario <= 2000) {
            imposto = salario * 0.05; // 5% de imposto
        } else if (salario <= 3500) {
            imposto = salario * 0.10; // 10% de imposto
        } else {
            imposto = salario * 0.15; // 15% de imposto
        }
        return imposto;
    }

    // Método para obter o salário
    public double getSalario() {
        return salario;
    }

    // Método principal para testar
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario(1800); // Salário de 1800
        Funcionario funcionario2 = new Funcionario(3000); // Salário de 3000
        Funcionario funcionario3 = new Funcionario(4000); // Salário de 4000

        System.out.println("Imposto para funcionário 1: " + funcionario1.calcularImposto());
        System.out.println("Imposto para funcionário 2: " + funcionario2.calcularImposto());
        System.out.println("Imposto para funcionário 3: " + funcionario3.calcularImposto());
    }
}