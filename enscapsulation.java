public class enscapsulation {
    public static void main(String[] args) {
        int n = 6,m=7;
      for (int i = 0; i < m; i++) {
                for(int j=0;j<n;j++){
                    if(i==0||j==0||i==m-1||j==n-1||i==j||){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("o ");
                    }
                }
                System.out.println(" ");
            }
        }   
}
