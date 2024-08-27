package secondsemester.fixationexercises;

public class Ex02 {
    public static void main(String[] args) {
        int arrays1[] = {1,2,3,4,5,6,7,8,9,10};
        int arrays2[] = {10,9,8,7,6,5,4,3,2,1};


        System.out.println("Arrays1 before change: ");
        for (int i : arrays1) {
            System.out.println(i+ " ");
        }
        System.out.println("Arrays2 before change: ");
        for (int i1 : arrays2) {
            System.out.println(i1+ " ");
        }

        System.out.println("Arrays changing...");
        for (int i = 0; i < arrays1.length ; i++) {
            int temp = arrays1[i];
            arrays1[i] = arrays2[i];
            arrays2[i] = temp;
        }


        System.out.println("\n\n Array1 after change: ");
        for (int i : arrays1) {
            System.out.println(i+" ");
        }

        System.out.println("\n\n Array2 after change: ");
        for (int i : arrays2) {
            System.out.println(i+" ");
        }
    }
}
