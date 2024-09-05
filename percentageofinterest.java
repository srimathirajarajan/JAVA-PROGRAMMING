import java.util.*;
public class percentageofinterest {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String gender = sc.nextLine();
        int age = sc.nextInt();
        if(gender.equalsIgnoreCase("Male")){
            if(age>=1 && age <= 59){
                System.out.print("8.4%");
            }
            else if(age>=59 && age <= 100){
                System.out.print("10.5%");
            }
        }
        if (gender.equalsIgnoreCase("Female")) {
            if (age >= 1 && age <= 59) {
                System.out.print("8.2%");
            }
            else if (age >= 59 && age <= 100) {
                System.out.print("9.2%");
            }
        }

    }
}
