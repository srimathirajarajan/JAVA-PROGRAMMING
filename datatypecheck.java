import java.util.*;
public class datatypecheck {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        char inp = sc.next().charAt(0);
        
        if (inp >= 'a' && inp <= 'z' || inp>='A' && inp <= 'Z'){
            System.out.print("alphabet");
        }
        else if (inp >= '0' && inp <= '9'){
            System.out.print("numbers");
        }
        else{
            System.out.print("special characters");
        }

        }
        
}
