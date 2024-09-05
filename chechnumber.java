import java.util.*;
public class chechnumber {
    /*public static void main(String [] args){
        Scanner  sc =  new Scanner(System.in);
        int a = sc.nextInt();
        if (a<0){
            System.out.print("negative");
        }
        else if(a==0){
            System.out.print("zero");
        }
        else{
            System.out.print("positive");
        }

    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a%10==b%10){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

    }
}
