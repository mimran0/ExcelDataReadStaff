package problems;

import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        Anagram obj=new Anagram();
        Boolean vOutput=obj.isAnagram("ABC","CBA");
        if(vOutput){
            System.out.println("This is anagram");
        }else {
            System.out.println("This is not anagram");
        }

    }


    private boolean isAnagram(String a, String b){
        Boolean isAnagram=false;

        if (a.length()!=b.length()){
            isAnagram=false;
        }else {
            a=a.toLowerCase();
            b=b.toLowerCase();
            char[] aArray=a.toCharArray();
            char[] bArray=a.toCharArray();
            Arrays.sort(aArray);
            Arrays.sort(bArray);
            if (Arrays.equals(aArray,bArray)){
                isAnagram=true;
            }
        }
        return isAnagram;
    }
}
