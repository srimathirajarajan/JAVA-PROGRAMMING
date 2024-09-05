public class array11 {
    public static void main(String [] args){
        int [] av  = {1,4,2,4};
        boolean flag=true;
        int i;
        for(i=0;i<av.length;i++){
            if(av[i]!=1 && av[i]!=4){
                flag=false;

        }
        
        }
        System.out.print(flag);
    }
}
