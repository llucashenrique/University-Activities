package secondsemester.exercisesmethods;

import java.util.Scanner;

public class FuncionarioSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar informações do funcionário
        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade do funcionário: ");
        int idade = scanner.nextInt();
        scanner.nextLine();  // Consumir a quebra de linha

        System.out.print("Digite o cargo do funcionário: ");
        String cargo = scanner.nextLine();

        System.out.print("Digite o salário bruto do funcionário: R$ ");
        double salarioBruto = scanner.nextDouble();

        // Aplicar o reajuste de 38% ao salário bruto
        double salarioReajustado = salarioBruto + (salarioBruto * 0.38);

        // Calcular a gratificação de 20% sobre o salário bruto reajustado
        double gratificacao = salarioReajustado * 0.20;

        // Calcular o salário total (salário reajustado + gratificação)
        double salarioTotal = salarioReajustado + gratificacao;

        // Aplicar o desconto de 15% no salário total
        double salarioLiquido = salarioTotal - (salarioTotal * 0.15);

        // Exibir o nome, idade e cargo
        System.out.println("\nInformações do Funcionário:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Cargo: " + cargo);

        // Exibir o salário bruto reajustado
        System.out.printf("Salário bruto reajustado: R$ %.2f%n", salarioReajustado);

        // Exibir o salário líquido
        System.out.printf("Salário líquido: R$ %.2f%n", salarioLiquido);

        scanner.close();
    }
}

