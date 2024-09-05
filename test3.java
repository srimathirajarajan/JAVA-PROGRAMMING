import java.util.Scanner;
public class test3 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int a[][] = new int[10][10];

    for(int i = 0;i<n;i++)
    {
        for (int j = 0; j < m; j++) {
            a[i][j] = sc.nextInt();
        }
    }for(int i = 0;i<n;i++)
    {
        for (int j = 0; j < m; j++) {
            System.out.print(a[i][j] + " ");
        }
        System.out.println();
    }
     for(int i=0;i<n;i++){
            if (i % 2 != 0) {
                    for (int j = 0; j < n / 2; j++) {
                        
                        int temp = a[i][j];
                        a[i][j] = a[i][n - j - 1];
                        a[i][n - j - 1] = temp;

                    }
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(a[i][j] + " ");
                }
                //System.out.println();
            }
        }
}

