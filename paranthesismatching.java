import java.util.Scanner;
public class paranthesismatching {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        char a ='(';
        char b =')';
        int count = 0;
        int count1 = 0;
        for (int i=0;i<str1.length();i++){
            if(str1.charAt(i)==a){
                count++;
            }
        }
        for(int i=0;i<str1.length();i++)
        {
            if (str1.charAt(i) == b) {
                count1++;
            }
        }
        if (count == count1) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }
    }
}
