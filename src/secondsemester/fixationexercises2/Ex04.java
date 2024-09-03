package secondsemester.fixationexercises2;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();

        System.out.println("Insira números inteiros (digite '0' para parar):");

        while (true) {
            int numero = scanner.nextInt();
            if (numero == 0) {
                break;
            }
            numeros.add(numero);
        }

        Collections.sort(numeros);

        System.out.println("Números maiores que 15:");
        for (int numero : numeros) {
            if (numero > 15) {
                System.out.println(numero);
            }
        }

        scanner.close();
    }
}

