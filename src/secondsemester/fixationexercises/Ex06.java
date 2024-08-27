package secondsemester.fixationexercises;

import java.util.Arrays;
import java.util.Collections;

public class Ex06 {
    public static void main(String[] args) {
        Integer a[] = {1, 2, 9, 4, 8, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Integer b[] = {5, 2, 8, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        Arrays.sort(a);
        Arrays.sort(b, Collections.reverseOrder());

        System.out.println("Imprimindo Array1 em ordem crescente: ");
        for (int i : a) {
            System.out.println(i + " ");
        }

        System.out.println("------------------------------");

        System.out.println("Imprimindo Array1 em ordem crescente: ");
        for (int i : b) {
            System.out.println(i + " ");
        }

    }
}
