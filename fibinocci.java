public class fibinocci {
    public int fibno(int input1){
        int fib = 0;
        int a = 0;
        int b = 1;
        for (int i = 1; i < input1-1; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }
        return fib;
    }
    public static void main(String [] args){
        int input1=3;
        fibinocci fb = new fibinocci();
        int c = fb.fibno(input1);
        System.out.print(c);
    }
}
