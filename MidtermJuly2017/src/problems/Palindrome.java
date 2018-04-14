package problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        Palindrome obj=new Palindrome();
        Boolean vOutput=obj.isPalindrome("DAD");
        if(vOutput){
            System.out.println("this is palindrome");
        }else {
            System.out.println("this is not palindrome");
        }


    }

    public boolean isPalindrome (String word) {
        String myWord = word.replaceAll("\\s+","");
        String reverse = new StringBuffer(myWord).reverse().toString();
        return reverse.equalsIgnoreCase(myWord);
    }
}
