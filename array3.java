public class array3 {
    public static void main(String [] args){
        int [] y = {22,33,56,23};
        int key = 48;
        int index = linearSearch( y,  key);
        if(index!=-1){
            System.out.print("element found at index: "+index);
        }
        else{
            System.out.print("element not found ");
        }
    }
    

        public static int linearSearch(int[] array, int target){
            for(int i=0;i<array.length;i++){
                if(array[i]==target){
                    return i;
                }
            }
            return -1;
        }
        }
    

