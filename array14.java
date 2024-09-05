import java.util.Scanner;
public class array14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[3][3];
        int max = Integer.MIN_VALUE;

        System.out.println("Enter 9 integers:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = scanner.nextInt();
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }

        System.out.println("The largest number in the array is: " + max);
    }
}

