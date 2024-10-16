package secondsemester.exercisesmethods;

import java.util.Scanner;

public class MediaSalarial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar o número de funcionários
        System.out.print("Digite a quantidade de funcionários: ");
        int quantidadeFuncionarios = scanner.nextInt();

        double somaSalarios = 0.0; // Variável para armazenar a soma dos salários

        // Laço para solicitar o salário de cada funcionário
        for (int i = 1; i <= quantidadeFuncionarios; i++) {
            System.out.print("Digite o salário do funcionário " + i + ": R$ ");
            double salario = scanner.nextDouble();
            somaSalarios += salario; // Somar o salário atual à soma total
        }

        // Calcular a média salarial
        double mediaSalarial = somaSalarios / quantidadeFuncionarios;

        // Exibir a média salarial
        System.out.printf("A média salarial é: R$ %.2f%n", mediaSalarial);

        scanner.close();
    }
}
