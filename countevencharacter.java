import java.util.Scanner;
public class countevencharacter {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int count=1;
        int sum=0;
        for(int i=1;i<input.length();i++){
            if(input.charAt(i)==input.charAt(i-1)){
                count++;
            }
            else{
                if(count%2==0){
                    sum+=count;
                }
                
                    count=1;
                
            }
        }
        if (count % 2 == 0) sum += count;
        System.out.println(sum);

    }
}
