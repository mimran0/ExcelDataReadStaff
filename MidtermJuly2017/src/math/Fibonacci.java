package math;

public class Fibonacci {
    public static void main(String[] args) {
        /*
          Write 40 Fibonacci numbers with java.
         */
        int pre=0;
        int next=1;
        //list of 40 Fibonacci numbers
        for (int i=0;i<40;i++){
            pre=pre+next;
            next=pre-next;
            System.out.println(pre);
        }
    }
}
