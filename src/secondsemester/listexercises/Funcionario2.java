package secondsemester.listexercises;

import java.util.Scanner;

public class Funcionario2 {
    private double salario;
    private String cargo;

    // Construtor
    public Funcionario2(double salario, String cargo) {
        this.salario = salario;
        this.cargo = cargo;
    }

    // Método para calcular o aumento salarial com base no cargo
    public double calcularAumento() {
        double aumento = 0;

        switch (cargo.toLowerCase()) {
            case "estagiario":
                aumento = salario * 0.10; // 10% de aumento
                break;
            case "junior":
                aumento = salario * 0.12; // 12% de aumento
                break;
            case "pleno":
                aumento = salario * 0.14; // 14% de aumento
                break;
            case "senior":
                aumento = salario * 0.16; // 16% de aumento
                break;
            default:
                System.out.println("Cargo inválido.");
                break;
        }

        return aumento;
    }

    // Método para calcular o novo salário após o aumento
    public double calcularNovoSalario() {
        return salario + calcularAumento();
    }

    // Método principal para testar
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando o salário e o cargo do funcionário
        System.out.print("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();
        scanner.nextLine(); // Consumir a quebra de linha

        System.out.print("Digite o cargo do funcionário (estagiario, junior, pleno, senior): ");
        String cargo = scanner.nextLine();

        // Criando um objeto Funcionario
        Funcionario2 funcionario2 = new Funcionario2(salario, cargo);

        // Calculando o novo salário
        double novoSalario = funcionario2.calcularNovoSalario();
        System.out.println("O novo salário do funcionário será: R$ " + novoSalario);

        scanner.close();
    }
}
