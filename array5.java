public class array5 {
    public static void main(String [] args){
        int [] arr = {23,45,12,34,56,37,90,41,63};
        int temp=0;
        int i;
        for(i =0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.println(arr[i]+" ");
            
        }
        System.out.println("Minimum 2 elements: " + arr[0] + " " + arr[1]);
        System.out.println("Maximum 2 elements: " + arr[arr.length - 2] + " " + arr[arr.length-1]);
    }
}
