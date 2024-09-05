import java.util.LinkedList;

public class middlelelinkedlikst {
    public static void main(String []args){
        LinkedList<Integer> values = new LinkedList<>();
        values.add(5);
        values.add(10);
        values.add(15);
        values.add(20);
        values.add(25); 
        values.add(30);
        values.add(35);
        int fast=0;
        int slow=0;
        while(fast<values.size() && fast + 1 < values.size()){
            slow++;
            fast+=2;
        }
          if(slow< values.size()){
            System.out.println(values.get(slow));
          }else{
            System.out.println("no middle element found");
          }
        }
    }

