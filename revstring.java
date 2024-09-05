import java.util.Scanner;
public class revstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String a = sc.nextLine();
        String r = "";

        for (int i = 0; i < a.length(); i++) {
            r = a.charAt(i) + r;
        }
        System.out.println(r);
    }
}

