import java.util.Scanner;
public class subsequence {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string:");
        String str = sc.nextLine();
        String str1 = sc.nextLine();
        int n = str.length();
        int m = str1.length();
        int count=0,i=0,j=0;
        while(i<n && j<m){
            if(str.charAt(i)==str1.charAt(j)){
                count++;
                i++;
                j++;
            }
            else{
                i++;
            }
        }
        if(count==m){
            System.out.print("yes");
        }
        else{
            System.out.print("no");
        }
    }
}
