import java.util.*;
public class color {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        char color = sc.next().charAt(0);
        switch(color){
            case 'R':
                System.out.println("red");
                break;
            case 'G':
                System.out.println("Green");
                break;
            default:
                System.out.print("white");

        }


    }
}
