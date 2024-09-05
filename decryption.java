import java.util.Scanner;
public class decryption {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int sum = 0;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                sum = sum - temp + (temp * 10 + s.charAt(i) - '0');
                temp = s.charAt(i) - '0';
            } else {
                temp = 0;
            }
        }
        System.out.println(sum);
    }
}
