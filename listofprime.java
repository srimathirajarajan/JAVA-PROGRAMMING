import java.util.Scanner;
public class listofprime {
    public static void main(String [] args )
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1;i<=n;i++){
           int v[i] = sc.nextInt();
            
        }

    }
    public static void prime(int n){
        
       int x,y,flg;
       System.out.println("All the prime number are:");
       for(x=1;x<=n;x++){
        if(x==1||x==0){
            continue:
        }
        flg=1;
        for(y=2;y<=x/2;++y){
            if(x%y==0){
                flg=0; 
                          
        }
       }
        
        
    }
    
}
