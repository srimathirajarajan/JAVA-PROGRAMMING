public class array1 {
    public static void main(String [] args){
        int [] x = new int [5];
        int sum = 0;
        int avg = 0;
        int i;
        for(i=1;i<x.length;i++){
            x[i]=i;
            sum += i;
            
        } 
        for (i = 1; i < x.length; i++) {
            System.out.print(x[i]);

        }
        avg = sum/x.length;
        System.out.println("sum"+" "+ sum);
        System.out.println("avg"+ " "+ avg);
    }
}
