public class pattern6 {
   
        public static void main(String[] agrs) {
            int n = 5;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n-i-1; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i+1; j++) {
                    System.out.print("* ");
                }
                System.out.println(" \n");
            }

        }
    }


