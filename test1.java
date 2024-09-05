import java.util.Scanner;
public class test1 {
    public static void main(String [] args){
        int count, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of ants");
        int n = sc.nextInt();
       
        
      
        String a[]= {"red","black","red","black","red"};
        for(int i=0;i<n;i++){

            if(a[i]=="red"){
                count++;
            }
            else{
                sum++;
            }
           
    }
    if (int count == int sum) {
        System.out.print("Peaceful");
    } else {
        System.out.print("Not peaceful");
    }
    }
}
