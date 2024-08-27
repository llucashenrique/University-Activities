package secondsemester.fixationexercises;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Entre com 10 numeros: ");
            numbers[i] = input.nextInt();
        }

        for (int i1 : numbers) {
            System.out.println(i1);
        }
    }
}
