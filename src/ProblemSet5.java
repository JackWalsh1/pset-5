/**
 * Problem Set 5.
 * 
 * It's time to put your skills to the test. This problem set focuses on using
 * built-in methods, most notable of the String class. It is also your first
 * introduction to methods that accept parameters and return values. The main
 * method is declared, but it is up to you to implement. Write your code for each
 * exercise in the corresponding method. Make sure you test your code thoroughly.
 * 
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Your code must meet the
 * requirements set forth in this section, and must support all possible values
 * that might be passed into your methods.
 * 
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

public class ProblemSet5 {
    
    public static void main(String[] args) {
        ProblemSet5 ps = new ProblemSet5();

        ps.surroundMe("in", "outs");
        ps.endsMeet("Sadness", 5);
        ps.middleMan("TeamTrees");
        ps.middleMan("Depression");

    }
    
    /*
     * Exercise 1.
     * 
     * Given two strings, return a new string built by surrounding in with the first
     * and last two characters of out.
     */
    
    public String surroundMe(String in, String out) {

        String output = "";
        
        if ((in != null) && (out != null) && out.length() == 4) {
            output += out.substring(0, 2) + in + out.substring(2);
        } else {
            output += in;
        }

        return output;

    }
    
    /*
     * Exercise 2.
     * 
     * Given a string and an integer, return a new string that represents the first
     * and last n characters of text.
     */
    
    public String endsMeet(String text, int n) {

        String output = "";

            //if text is not null and is between 1 and 10 characters, inclusive and n is between 1 and the length of the text, inclusive
        if ((text != null) && (1 <= text.length() && text.length() <= 10) && (1 <= n && n <= text.length())) {
            output = text.substring(0, n) + text.substring(text.length() - n);
        } else {
            output = text;
        }

        return output;
    }
    
    /*
     * Exercise 3.
     * 
     * Given a string, return a new string using the middle three characters of text.
     */
    
    public String middleMan(String text) {

        String output = "";

        if ((text != null) && (text.length() % 2 == 1) && (text.length() > 2)) {
            int middle = text.length() / 2;
            output = text.substring(middle - 1, middle + 2);
        } else {
            output = text;
        }
        
        return output;

    }
    
    /*
     * Exercise 4.
     * 
     * Given two strings, determine whether or not target is equivalent to the middle
     * three characters of text.
     */
    
    public boolean isCentered(String text, String target) {
        boolean temp = false;
        return temp;
    }
    
    /*
     * Exercise 5.
     * 
     * Given a string and a character, compute the number of words that end in suffix.
     */
    
    public int countMe(String text, char suffix) {
        int temp = 1;
        return temp;
    }
    
    /*
     * Exercise 6.
     * 
     * Given a string, compute the number of triplets in text.
     */
    
    public int triplets(String text) {
        int temp = 1;
        return temp;
    }
    
    /*
     * Exercise 7.
     * 
     * Given a string, compute the sum of the digits in text.
     */
    
    public long addMe(String text) {
        long temp = 1;
        return temp;
    }
    
    /*
     * Exercise 8.
     * 
     * Given a string, compute the length of the longest sequence.
     */
    
    public long sequence(String text) {
        long temp = 1;
        return temp;
    }
    
    /*
     * Exercise 9.
     * 
     * Given two strings, return a new string built by intertwining each of the
     * characters of a and b.
     */
    
    public String intertwine(String a, String b) {
        return a;
    }
    
    /*
     * Exercise 10.
     * 
     * Given a string, determine whether or not it is a palindrome.
     */
    
    public boolean isPalindrome(String text) {
        boolean temp = false;
        return temp;
    }
}
