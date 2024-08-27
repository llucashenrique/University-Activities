package secondsemester.fixationexercises;

public class Ex04 {
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};


        System.out.println("Numeros que são maiores que 10: ");
        for (int i : numbers) {
            if (i >= 10){
                System.out.println(i);
            }
        }
    }
}
