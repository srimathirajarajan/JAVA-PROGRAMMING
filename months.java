import java.util.Scanner;
public class months {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        switch(month){
            case 1:
                System.out.println("january");
                break;
            case 2:
                System.out.println("feb");
                break;
            case 3:
                System.out.println("march");
                break;
            case 4:
                System.out.println("april");
                break;
            default:
                System.out.print("no defined");

        }
    }
}
