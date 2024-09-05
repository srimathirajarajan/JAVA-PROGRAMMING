import java.util.Scanner;
public class removeduplicates {
    public static void main(String [] args){
        
        int [] a = new int[10];
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int flag=0;
            for(int j=0;j<i;j++){
                if(a[i]==a[j]){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.print(a[i]);
            }
        }
        
    }
}
