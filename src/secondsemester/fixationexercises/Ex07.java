package secondsemester.fixationexercises;

public class Ex07 {
    public static void main(String[] args) {
        int[] A = {1, 0, 5, -2, -5, 7};

        int soma = A[0] + A[1] + A[5];
        System.out.println("A soma dos valores A[0], A[1] e A[5] é: " + soma);

        A[4] = 100;

        System.out.println("Os valores do vetor A são:");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
}

