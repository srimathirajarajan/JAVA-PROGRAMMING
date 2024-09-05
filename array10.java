public class array10 {
    public static void main(String [] args){
        int [] ar = {1,0,1,0,0,1,1a};
        int i,j;
        int temp;
        for(i=0;i<ar.length;i++){
            for(j=i+1;j<ar.length;j++){
                if(ar[i]%2!=0){
                    temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                }
            }
            System.out.print(ar[i]+" ");
        }
    }
}
