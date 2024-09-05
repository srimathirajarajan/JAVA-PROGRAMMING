import java.util.Scanner;

public class spiralmatrix {
    public static void main(String args[]) {
        int i, j, r, c;
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        c = sc.nextInt();
        int a[][] = new int[r][c];

        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int top = 0;
        int bottom = r - 1;
        int left = 0;
        int right = c - 1;

        while (bottom >= top && left <= right) {
            for (i = top; i <= right; i++) {
                System.out.print(a[top][i] + " ");

            }
            top++;
            for (i = top; i <= bottom; i++) {
                System.out.print(a[i][right] + " ");
            }
            right--;
            for (i = right; i >= left; i--) {
                System.out.print(a[bottom][i] + " ");
            }
            bottom--;
            for (i = bottom; i >= top; i--) {
                System.out.print(a[i][left] + " ");
            }
            left++;
        }
    }
}