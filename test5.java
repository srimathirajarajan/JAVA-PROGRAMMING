import java.util.Scanner;
public class test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String a = sc.nextLine();
        String r = "";
        int len = r.length();
        String s2 = "";
        for (int i = len - 1; i >= 0; i--) {
            if (r.charAt(i) == ' ') {
                for (int j = i + 1; j < len; j++) {
                    if (a.charAt(j) == ' ') {
                        break;
                    }
                    System.out.print(a.charAt(j));
                }
                System.out.print(" ");
            }
        }
        for (int i = 0; i < len; i++) {
            if (a.charAt(i) == ' ')
                break;
            System.out.print(a.charAt(i));
        }

        for (int i = 0; i < a.length(); i++) {
            r = a.charAt(i) + r;
        }
        System.out.println(r);

    }
}


