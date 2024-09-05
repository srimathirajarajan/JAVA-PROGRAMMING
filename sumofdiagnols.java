import java.util.Scanner;
public class sumofdiagnols {
    public static void main(String[]args)
    {
        
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int m[][] = new int[row][col];
        for (int i=0;i<row;i++){
            for(int j=0;j<col;j++)
            {
                 m[i][j] = sc.nextInt();
            }
        }
        //Forward direction.
        int sum=0;
        for(int i=0;i<row;i++){
            sum = sum+m[i][i];
        
        }
        System.out.println(sum);
        //reverse direction
        int sum1=0;
        for(int i=0;i<row;i++){
            sum1=sum1+m[i][row-i-1];
        
        }
        System.out.println(sum1);
    }
}
