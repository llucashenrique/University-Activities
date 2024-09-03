package secondsemester.fixationexercises2;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int term = 0;
        int paycash = 0;

        while (true) {

            System.out.println("Entre com 1(p/ a vista ou Entre com 2(p/prazo))");
            int transaction = input.nextInt();

            switch (transaction) {
                case 1:
                    System.out.println("Voce escolheu opcao a vista");
                    term++;
                    break;
                case 2:
                    System.out.println("Voce escolheu opcao a prazo");
                    paycash++;
                    break;
            }

            int total = term + paycash;

            System.out.println("Numeros de compras a vista: " + paycash);
            System.out.println("Numeros de compras a prazo: " + term);
            System.out.println("Numeros total de compras: " + total);
        }
    }
}
