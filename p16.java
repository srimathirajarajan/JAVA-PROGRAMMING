public class p16 {
    public static void main(String[] args) {
        int n = 6;
        int a = 1;
        for (int i = 0; i < n; i++){
            for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
            
        }
        for (int i = 1; i < n; i++){
           for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
       
        System.out.println(" ");
        
    }
    }
}