import java.util.Scanner;
public class locationofmatix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[][] = new int[n][m];
        int e=0;
        int o=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        int x = sc.nextInt();
        int row = (x-1)/n;
        int col = (x-1)%n;
        System.out.println("the row is :"+row);
        System.out.println("the column is: "+col);
    }

}
