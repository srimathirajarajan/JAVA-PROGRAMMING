import java.util.*;
public class sumofdigits {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum=0;
        for(int i = num; i > 0; i++){
            int a=num%10;
            sum+=a;
            int rem = num/10;
            num=rem;
        }
        System.out.print(sum);
    }
}
