package secondsemester.activitystatement;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int funcionariosAcimaDe7000 = 0;
        int funcionariosAbaixoDe7000 = 0;
        double somaSalarioLiquido = 0;
        int contadorFuncionarios = 0;

        System.out.print("Digite a quantidade de funcionários: ");
        int quantidadeFuncionarios = scanner.nextInt();

        for (int i = 0; i < quantidadeFuncionarios; i++) {
            System.out.println("Funcionário " + (i + 1));

            System.out.print("Código de matrícula: ");
            int codigoMatricula = scanner.nextInt();

            System.out.print("Salário Bruto: ");
            double salarioBruto = scanner.nextDouble();

            System.out.print("Número de dependentes: ");
            int numeroDependentes = scanner.nextInt();


            double salarioFamilia = numeroDependentes * 120.00;


            double descontoINSS = calcularINSS(salarioBruto);

            double salarioBaseIR = salarioBruto - descontoINSS - salarioFamilia;
            double impostoRenda = calcularImpostoRenda(salarioBaseIR);


            double salarioLiquido = salarioBruto + salarioFamilia - descontoINSS - impostoRenda;

            contadorFuncionarios++;
            somaSalarioLiquido += salarioLiquido;


            if (salarioLiquido > 7000) {
                funcionariosAcimaDe7000++;
            } else {
                funcionariosAbaixoDe7000++;
            }

            System.out.println("Código: " + codigoMatricula);
            System.out.println("Salário Bruto: " + salarioBruto);
            System.out.println("Salário Família: " + salarioFamilia);
            System.out.println("Desconto INSS: " + descontoINSS);
            System.out.println("Imposto de Renda: " + impostoRenda);
            System.out.println("Salário Líquido: " + salarioLiquido);
            System.out.println("--------------------------------------------");

            if (contadorFuncionarios > 1) {
                double mediaSalarioLiquido = somaSalarioLiquido / contadorFuncionarios;
                System.out.println("Média dos salários líquidos até agora: " + mediaSalarioLiquido);
            }
        }

        System.out.println("Total de funcionários com salário acima de 7000: " + funcionariosAcimaDe7000);
        System.out.println("Total de funcionários com salário abaixo de 7000: " + funcionariosAbaixoDe7000);

    }

    public static double calcularINSS(double salarioBruto) {
        if (salarioBruto <= 1100) {
            return salarioBruto * 0.075;
        } else if (salarioBruto <= 2200) {
            return salarioBruto * 0.09;
        } else if (salarioBruto <= 3300) {
            return salarioBruto * 0.12;
        } else {
            return salarioBruto * 0.14;
        }
    }

    public static double calcularImpostoRenda(double salarioBaseIR) {
        if (salarioBaseIR <= 1903.98) {
            return 0;
        } else if (salarioBaseIR <= 2826.65) {
            return salarioBaseIR * 0.075;
        } else if (salarioBaseIR <= 3751.05) {
            return salarioBaseIR * 0.15;
        } else if (salarioBaseIR <= 4664.68) {
            return salarioBaseIR * 0.225;
        } else {
            return salarioBaseIR * 0.275;
        }
    }
}
