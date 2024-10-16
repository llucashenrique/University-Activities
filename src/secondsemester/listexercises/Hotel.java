package secondsemester.listexercises;

import java.util.Scanner;

public class Hotel {
    private double precoDiaria;

    // Construtor
    public Hotel(double precoDiaria) {
        this.precoDiaria = precoDiaria;
    }

    // Método para calcular o custo total com base no número de diárias
    public double calcularCustoTotal(int numeroDiarias) {
        return precoDiaria * numeroDiarias;
    }

    // Método principal para testar
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo o preço da diária
        System.out.print("Digite o preço da diária do hotel: ");
        double preco = scanner.nextDouble();

        Hotel hotel = new Hotel(preco);

        // Solicitando o número de diárias
        System.out.print("Digite o número de diárias: ");
        int numeroDiarias = scanner.nextInt();

        // Calculando e exibindo o custo total
        double custoTotal = hotel.calcularCustoTotal(numeroDiarias);
        System.out.println("O custo total da hospedagem será: R$ " + custoTotal);

        scanner.close();
    }
}