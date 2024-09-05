import java.util.*;
public class casechnage {
   public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        char item1 = sc.next().charAt(0);
        if (item1 >= 'A' && item1 <='Z') {
            System.out.print(Character.toLowerCase(item1));
        }
        else if(item1 >= 'a' && item1 <= 'z'){
            System.out.print(Character.toUpperCase(item1));
        
        }
    }
}
