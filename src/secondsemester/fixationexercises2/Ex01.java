package secondsemester.fixationexercises2;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner input = new Scanner(System.in);

        System.out.println("Entre com numero de referencia: ");
        int numberRef = input.nextInt();

        for (int number : numbers) {
            if (number < numberRef) {
                System.out.println(number);
            }
        }
    }
}
