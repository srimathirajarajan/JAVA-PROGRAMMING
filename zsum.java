import java.util.Scanner;
public class zsum {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int a[][] = new int[n][m];
    int sum=0;
    for(int i = 0;i<n;i++)
    {
        for (int j = 0; j < m; j++) {
            a[i][j] = sc.nextInt();
        }
    }
    for(int i = 0;i<n;i++)
    {
        for (int j = 0; j < m; j++) {
            System.out.print(a[i][j] + " ");
        }
        System.out.println();
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(i==0 || i == n-1 || j==m-i-1)
            {
                sum+=a[i][j];
            }
        }
    }
        System.out.print(sum);
    }
 }


