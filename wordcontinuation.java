import java.util.Scanner;
public class wordcontinuation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w1 = sc.next();
        String w2 = sc.next();
        int n = w1.length();

        while(w2.charAt(0)==w1.charAt(n-1)){
            System.out.println(w2);
            w1=w2;
            w2=sc.next();
            n=w1.length();
     
           }
           }
}
