public class p12 {
    public static void main(String[] args) {
        int n=5;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    System.out.print(i+1);
                    //a++;
                }
                else if(j==n-i-1){
                   
                    System.out.print(j+1);
                    
                    
                }
                else{
                 System.out.print(" ");
                }   
             }
             System.out.println();
        }

    }
}
