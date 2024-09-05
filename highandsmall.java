public class highandsmall {
    public static void main(String []args)
    {
        int n=6;
        int a[] =  {5,1,6,4,3,2};
        for (int i=0;i<n;i++){
            for(int j=i+1;j<n;j++)
            {

                if(i%2==0){
                    if (a[i] > a[j]) {
                        int temp = 0;
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;

                    }
                }
                else{
                    if (a[i] < a[j]) {
                        int temp = 0;
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;

                    }
                }
                

            }
            System.out.println(a[i]);
        }
        


    }
}
