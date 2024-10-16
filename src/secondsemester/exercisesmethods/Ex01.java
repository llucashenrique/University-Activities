package secondsemester.exercisesmethods;

import java.util.Scanner;

public class Emprestimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar o salário do usuário
        System.out.print("Digite o seu salário: ");
        double salario = scanner.nextDouble();

        // Solicitar o valor da prestação
        System.out.print("Digite o valor da prestação: ");
        double prestacao = scanner.nextDouble();

        // Calcular 20% do salário
        double limitePrestacao = salario * 0.20;

        // Verificar se a prestação é maior que 20% do salário
        if (prestacao > limitePrestacao) {
            System.out.println("Empréstimo não pode ser concedido.");
        } else {
            System.out.println("Empréstimo pode ser concedido.");
        }

        scanner.close();
    }
}

