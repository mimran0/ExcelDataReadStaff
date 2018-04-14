package math;

/**
 * Created by mrahman on 04/22/17.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        int a=5;
        int result = 1;
        for (int i=1;i<a+1;i++){
            result=result*i;
            //System.out.println(i);
        }
        System.out.println("The recursion number of "+a+ " is "+ result);
    }
}
