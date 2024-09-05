public class p14 {
    public static void main(String[] args){
        int n=4;
        int a=1;
        int b=(n*n)+1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print(a+"*");
                a++;
            }
            for (int j = 0; j < n - i-1; j++) {
                System.out.print(b + "*");
                b++;
            }
            System.out.print(b);
            b = b-2*(n-i-1);
            System.out.println("");
           
        }
    }

    }

