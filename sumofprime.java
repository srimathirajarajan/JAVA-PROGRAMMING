import java.util.*;
public class sumofprime {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int from = sc.nextInt();
        int to = sc.nextInt();
        boolean flag = false;
        int i;
        for( i=from ; i<=to;i++){
            if(i<=1){
                continue;
            }
            flag=true;
        
        for(int j=2;j<=i/2;j++){
            if(i%j==0){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.print(i+" ");
        }
        }
    }
}

