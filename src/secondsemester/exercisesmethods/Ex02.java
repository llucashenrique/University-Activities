package secondsemester.exercisesmethods;

import java.util.Scanner;

public class Aposentadoria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int funcionariosCom30AnosTrabalho = 0; // Contador de funcionários com 30 anos de trabalho e abaixo de 65 anos

        while (true) {
            // Solicitar o código do empregado
            System.out.print("Digite o código do empregado (ou 0 para sair): ");
            int codigo = scanner.nextInt();
            if (codigo == 0) {
                break; // Encerra o programa se o código for 0
            }

            // Solicitar o ano de nascimento do empregado
            System.out.print("Digite o ano de nascimento do empregado: ");
            int anoNascimento = scanner.nextInt();

            // Solicitar o ano de ingresso na empresa
            System.out.print("Digite o ano de ingresso na empresa: ");
            int anoIngresso = scanner.nextInt();

            // Calcular a idade e o tempo de trabalho
            int anoAtual = 2024; // Ano atual
            int idade = anoAtual - anoNascimento;
            int tempoTrabalho = anoAtual - anoIngresso;

            // Exibir a idade e o tempo de trabalho
            System.out.println("Idade: " + idade + " anos");
            System.out.println("Tempo de trabalho: " + tempoTrabalho + " anos");

            // Verificar se o funcionário se qualifica para aposentadoria
            if (idade >= 65 || tempoTrabalho >= 30 || (idade >= 60 && tempoTrabalho >= 25)) {
                System.out.println("Requerer aposentadoria.");
            } else {
                System.out.println("Não requerer.");
            }

            // Contabilizar funcionários com 30 anos de trabalho e abaixo de 65 anos
            if (tempoTrabalho >= 30 && idade < 65) {
                funcionariosCom30AnosTrabalho++;
            }

            System.out.println(); // Linha em branco para separar as entradas
        }

        // Exibir o total de funcionários com 30 anos de trabalho e abaixo de 65 anos
        System.out.println("Total de funcionários com 30 anos de trabalho e abaixo de 65 anos: " + funcionariosCom30AnosTrabalho);

        scanner.close();
    }
}
