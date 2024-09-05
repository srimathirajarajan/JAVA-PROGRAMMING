import java.util.Scanner;
public class nonrepeatingchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s1 = sc.nextLine();
        int len = s1.length();
       
        for(int i=0;i<len;i++){
             int count = 0;
            for(int j=0;j<len;j++){
                 if(s1.charAt(i) == s1.charAt(j)&& i!=j){
                     count++;
                     break;
                 }
            }
            if (count == 0){
                System.out.println(s1.charAt(i));
                break;
            }
        }
        
    }
}
        
