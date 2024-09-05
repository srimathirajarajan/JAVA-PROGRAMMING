public class array2 {
    public static void main(String [] args){
        int [] x = {28,24,86,35};
        int i;
        int max = x[0];
        int min = x[0];
        for(i=1;i<x.length;i++){
            if(x[i]>max)
                max = x[i];
        }
        for (i = 1; i < x.length; i++) {
            if (x[i] < min)
                min = x[i];
        }
        System.out.println(max);
        System.out.println(min);

    }
}
