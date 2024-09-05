public class array6 {
    public static void main(String [] args){
        int [] a = {34,56,12,89,32,72};
        int i,j;
        int temp=0;
        for(i=0;i<a.length;i++){
            for(j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j]=temp;
                }

            }
            System.out.println(a[i]);
        }

    }
}
