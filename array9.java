public class array9 {
    public static void main(String [] args){
        int [] ax = {1,10,10,2};
        int i,j;
        int temp;
        for(i=0;i<ax.length;i++){
            if(ax[i]==10){
                
                ax[i]=0;

            }
            else{
                ax[i]=ax[i];
            }
            System.out.println(ax[i] + " ");
        }
        for(i=0;i<ax.length;i++){
            for(j=i+1;j<ax.length;j++){
                if(ax[i]==0){
                    temp = ax[i];
                    ax[i]=ax[j];
                    ax[j]=temp;
                }
            }
            System.out.print(ax[i]+" ");
        }

       
    }
}
