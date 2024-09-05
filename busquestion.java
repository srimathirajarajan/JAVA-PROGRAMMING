import java.util.Scanner;
public class busquestion {
    public static void main(String []args){
        int[] a = new int[10];
        int bus =1;
        int sum=0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Capacity");
        int c = sc.nextInt();

        for(int i=0;i<n;i++){
            if(sum+a[i]>c){
                bus++;
                sum=a[i];
            }
            else{
                sum+=a[i];
            }
           
              
            
        }
        System.out.print(bus);
       
    }
}
