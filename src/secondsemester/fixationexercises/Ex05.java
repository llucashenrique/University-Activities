package secondsemester.fixationexercises;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int B[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int resultado[] = new int[8];


        for (int i = 7; i >= 0 ; i--) {
            resultado[i] = A[i] - B[i];
        }

        System.out.println("Resultado da subtracao de arrays: ");
        for (int i = 0; i < resultado.length; i++) {
            System.out.println("Posicao"+i+": "+resultado[i]);
        }
    }
}
