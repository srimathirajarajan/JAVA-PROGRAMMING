public class primenumber {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        primenumber p = new primenumber();
        boolean result = p.isPrime(13);
        System.out.println(result);
    }
}
