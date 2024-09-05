import java.util.Scanner;
public class diagonalequal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[][] = new int[n][m];
        int sum = 0;
        int count=0;
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
        for (int i = 0; i < n; i++) {
               sum+=a[i][i];
               count+=a[i][n-i-1];
            }
        
        if(sum==count){
            System.out.print("equal");
        }
        else{
            System.out.print("not equal");
        }

    }
}
