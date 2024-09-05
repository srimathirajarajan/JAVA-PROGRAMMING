import java.util.Scanner;

public class oddoreven {
    public static void main(String [] args){
        
        int [] a = new int[10];
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
            if(a[i]%2 == 0){
                int temp=0;
                temp=a[i];
                a[i]=a[j];
                a[j]=temp; 
            }
            if (a[i]%2==0 && a[j]==0){
                if(a[i]>a[j]){
                    
                }
            }
            
        }
    }
}