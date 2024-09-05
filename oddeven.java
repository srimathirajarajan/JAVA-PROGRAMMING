import java.util.Scanner;
public class oddeven {
    public static void main(String [] args){
        
        int [] a = new int[10];
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {

            if (a[i] % 2 != 0) {
                System.out.print(a[i]+" ");
            }

        }
        for(int i=0;i<n;i++)
        {
                if (a[i] % 2 == 0) {
                    System.out.print(a[i]+" ");
                }
            
           
        }
        

        
    }
}
