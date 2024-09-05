public class array7 {
    public static void main(String [] args){
        int [] z = {12,23,87,12,34,89};
        int i,j;
        
        for(i=0;i<z.length;i++){
            int flag = 0;
            for(j=i+1;j<z.length;j++){
                
                if(z[i]==z[j]){
                    flag=1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.print(z[i]+" ");
            }
        }
    }
}
