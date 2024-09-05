import java.util.Scanner;
public class swapin2d {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[][] = new int [10][10];
        int b[][] = new int [10][10];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                b[j][i]=a[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <m; j++) {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
