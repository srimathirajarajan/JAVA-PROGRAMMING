import java.util.*;
public class array12 {
    public static void main(String [] args){
        int [] a = {1,2,3};
        int [] b = {4,5,6};
        int [] arr=new int[2];
        int lenA = a.length/2;
        int lenB = b.length/2;
        arr[0]=a[lenA];
        arr[1] = b[lenB];
        
        System.out.print(Arrays.toString(arr));

    }
}
