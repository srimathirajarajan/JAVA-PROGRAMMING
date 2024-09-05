import java.util.Scanner;
public class uppertriangular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[][] = new int[10][10];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(i>j){
                    if(a[i][j]==0){
                    System.out.print("Upper trianglur matrix");
                }
                else{
                    System.out.println("not an upper triangular matrix");
                }
            }
            }
        }

    }
}
