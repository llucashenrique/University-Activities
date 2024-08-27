package secondsemester.fixationexercises;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arrasy1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int numMaior = 0;
        int numMenor = 0;
        System.out.println("Entre com valor de referência: ");
        int ref1 = input.nextInt();

        System.out.println("------------------------------------");
        System.out.println("Aparece quantas vezes o numero e menor que o valor de referência ");
        for (int i : arrasy1) {
            if (i > ref1) {
                System.out.println(i);
            }else {
                numMenor++;
            }
        }
        System.out.println("-------------------------------------");

        System.out.println("Imprimindo quantas vezes o valor de referência aparece no vetor: ");
        for (int i : arrasy1) {
            if (i == ref1){
                System.out.println(i);
            }
        }

    }
}
