import java.util.Scanner;

public class toss {
    public static int fact(int n){
       int  fact = 1;
       for(int i=n;i>=1;i--)
       {
        fact = fact*i;
       }
       return fact;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int val = n-r;
        int x = (int) Math.pow(2,n);
        float v = (fact(n))/(fact(r) * fact(val));
        float res = v/x;
        System.out.printf("prob: %.6f",res);

    }
}
