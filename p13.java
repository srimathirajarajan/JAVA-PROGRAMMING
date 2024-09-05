import java.util.Scanner;
public class p13 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int b[]   = new int[5];
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print(b[i]);
                    // a++;
                } else if (j == n - i - 1) {

                    System.out.print(b[n-i-1]);

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
