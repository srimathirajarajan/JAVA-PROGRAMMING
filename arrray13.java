public class arrray13 {
    public static void main(String [] args){
        int [][] x = new int [2][2];
        int i;
        for( i=0;i<x.length;i++) {
            for(int j=i;j<x.length;j++){
                x[i][j]=i+j;
                System.out.println(x[i][j]+" ");
            }
        }
        for(int k=0;k<x.length;k++){
            int start = 0;
            int end = x.length-1;
            while(start<end){
                int temp = x[k][start];
                x[k][start] = x[k][end];
                x[k][end]=temp;
                start++;
                end--;
            }
        }
        for (i = 0; i < x.length; i++) {
            for (int j = i; j <x.length; j++) {
                System.out.print(x[i][j]+" ");
            }
        }
        
    }
}
