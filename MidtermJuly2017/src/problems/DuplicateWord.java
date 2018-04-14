package problems;

import java.util.*;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        List<String> list = Arrays.asList(st.split(" "));

        Set<String> uniqueWords = new HashSet<String>(list);
        int vTotalLength=0;
        int vWordCount=0;
        for (String word : uniqueWords) {
            System.out.println(word + ": " + Collections.frequency(list, word));
            //System.out.println(word.length());
            vTotalLength=vTotalLength+word.length();
            vWordCount++;
        }
        //System.out.println(vTotalLength);
        //System.out.println(vWordCount);
        int averageLentgh=(vTotalLength/vWordCount);
        System.out.println("Average length is "+averageLentgh);



    }

}
