package secondsemester.exercisesmethods;

import java.util.Scanner;

public class LojaCompreSempre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar o valor da compra
        System.out.print("Digite o valor da compra: R$ ");
        double valorCompra = scanner.nextDouble();

        // Solicitar o código do cupom
        System.out.print("Digite o código do cupom: ");
        int codigoCupom = scanner.nextInt();

        double desconto = 0;

        // Verificar o cupom e aplicar o desconto correspondente
        switch (codigoCupom) {
            case 100:
                if (valorCompra <= 400) {
                    desconto = 0.20; // 20% de desconto
                }
                break;
            case 200:
                if (valorCompra <= 600) {
                    desconto = 0.25; // 25% de desconto
                }
                break;
            case 300:
                if (valorCompra <= 850) {
                    desconto = 0.30; // 30% de desconto
                }
                break;
            default:
                // Se o cupom não for um dos listados, aplicar 15% de desconto
                desconto = 0.15;
        }

        // Calcular o valor final com o desconto
        double valorComDesconto = valorCompra - (valorCompra * desconto);

        // Exibir o valor a ser pago com o desconto aplicado
        System.out.printf("Valor original: R$ %.2f%n", valorCompra);
        System.out.printf("Percentual de desconto aplicado: %.0f%%%n", desconto * 100);
        System.out.printf("Valor final com desconto: R$ %.2f%n", valorComDesconto);

        scanner.close();
    }
}

