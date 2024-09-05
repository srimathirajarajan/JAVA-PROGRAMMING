import java.util.Scanner;

public class removevewols {
    public static void main(String []args){
        String result = "";
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        for(int i=0;i<str1.length();i++){
            char c = str1.charAt(i);
            
            if(c != 'a' && c !='e' && c !='i' && c !='o' && c !='u'){
                
                result += c;
                
            }
        }
        System.out.println(result);

    }
}
