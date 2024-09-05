import java.util.Scanner;
public class stringpalindrome {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i=0,j=s.length()-1;
        while ( i <= j) {

            // If there is a mismatch
            if (s.charAt(i) != s.charAt(j)){
                System.out.print("not palindrome");
                return;
            }

              i++;
              j--;
        }

        // Given string is a palindrome
        System.out.print("palindrome");
    }
}
