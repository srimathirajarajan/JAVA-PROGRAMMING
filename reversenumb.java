import java.util.*;
public class reversenumb {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reversednum = 0;
        while(n!=0){
            int a = n%10;
            reversednum =  reversednum*10+a;
            n = n/10;
            
        }
        System.out.print(reversednum);

        
    }
}
