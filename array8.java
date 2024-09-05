public class array8 {
    public static void main(String [] args){
        int [] ar = {10,3,6,1,2,7,9};
        boolean flag = false;
        int i;
        int sum=0;
        for(i=0;i<ar.length;i++){

            if(ar[i]==6){
                flag=true;
            }
            if (!flag) {
                sum += ar[i];
            }
            if(ar[i]==7 && flag){
                flag=false;
            }
            
        }
        System.out.print(sum);

    }
}
