import java.util.*;
public class palindrome {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int reverse = 0;
        while(n!=0){
            int a = n%10;
            reverse = reverse*10+a;
            n = n /10;
        }
        if(temp==reverse){
            System.out.print("palindorme");
        }
        else{
            System.out.print("not a palindrome");
        }
    }
}
