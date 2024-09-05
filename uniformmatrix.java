import java.util.Scanner;
public class uniformmatrix {
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
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i][j]%2==0){
                    e++;
                }
                else{
                    o++;
                }
            }
        }
        if(e==o){
            System.out.print(" no equal");

        }
        else{
            System.out.print(" equal");

        }
    }
}
