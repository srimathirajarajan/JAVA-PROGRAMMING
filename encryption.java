import java.util.Scanner;
public class encryption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        for(int i=0;i<n-1;i=i+2){
            char temp = s.charAt(i);
            s.charAt(i)=s.charAt(i+1);
            s.charAt(i+1)=temp;
        }
        System.out.print(s);

        }
}
