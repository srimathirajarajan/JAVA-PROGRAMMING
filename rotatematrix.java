import java.util.Scanner;
public class rotatematrix {
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
        for(int j=0;j<i;j++){
            int temp = a[i][j];
            a[i][j] = a[j][i];
            a[j][i]=temp;
            
            

        }
    }
    System.out.println("Tranpose matrix");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            System.out.print(a[i][j] + " ");
        }
        System.out.println();
    }
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n/2; j++) {
            int temp = a[i][j];
            a[i][j] = a[i][n-j-1];
            a[i][n-j-1] = temp;  

        }
    }
    System.out.println("Rotate matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    

  }
}
