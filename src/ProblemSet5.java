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
        ps.isCentered("TeamTrees", "mTr");
        ps.countMe("kjfdakjlt satrj dasfiaun432t fasiufasjd T klasdio34t.", 't');
        ps.triplets("booo boooooooooooooooooooooooooooy");
        ps.addMe("1000 test cases, 100% loss of sanity, 30 hours, five times where I ate.");

        System.out.println(ps.sequence("abbcccdddd"));
        System.out.println(ps.sequence("aAabBbBb"));
        System.out.println(ps.sequence(""));
        System.out.println(ps.sequence("   "));
        System.out.println(ps.sequence(null));

    }
    
    /*
     * Exercise 1.
     * 
     * Given two strings, return a new string built by surrounding in with the first
     * and last two characters of out.
     */
    
    public String surroundMe(String in, String out) {

        String output = in;
        
        if ((in != null) && (out != null) && out.length() == 4) {
            output = out.substring(0, 2) + in + out.substring(2);
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

        String output = text;

            //if text is not null and is between 1 and 10 characters, inclusive and n is between 1 and the length of the text, inclusive
        if ((text != null) && (1 <= text.length() && text.length() <= 10) && (1 <= n && n <= text.length())) {
            output = text.substring(0, n) + text.substring(text.length() - n);
        }

        return output;
    }
    
    /*
     * Exercise 3.
     * 
     * Given a string, return a new string using the middle three characters of text.
     */
    
    public String middleMan(String text) {

        String output = text;

        if ((text != null) && (text.length() % 2 == 1) && (text.length() > 2)) {
            int middle = text.length() / 2;
            output = text.substring(middle - 1, middle + 2);
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
        boolean centerIsTarget = false;
        
        if ((text != null && target != null) && (text.length() % 2 == 1) && (text.length() > 2 && target.length() == 3)) {
            int middle = text.length() / 2;
            centerIsTarget = text.substring(middle - 1, middle + 2).equals(target);
        } 

        return centerIsTarget;
    }
    
    /*
     * Exercise 5.
     * 
     * Given a string and a character, compute the number of words that end in suffix.
     */
    
    public int countMe(String text, char suffix) {
        
        int suffixedWords = -1;

        if ((text != null && text.length() != 0) && (Character.isAlphabetic(suffix))) {
            
            int splicePoint;
            String splicedText = "";
            char lastCharacter = text.charAt(text.length() - 1);
            boolean lastWordInString = false;
            String suffixString = Character.toString(suffix);

            suffixedWords++;

            while (!lastWordInString) {

                if (text.contains(" ")) {
                    splicePoint = text.indexOf(" ");
                    splicedText = text.substring(0, splicePoint);
                    text = text.substring(splicePoint + 1);
                } else {
                    lastWordInString = true;
                    splicedText = text;
                    if (!(Character.isLetterOrDigit(lastCharacter))){
                        splicedText = splicedText.substring(0, splicedText.length() - 1);
                    }
                }

                if (splicedText.substring(splicedText.length() - 1).equals(suffixString)) {
                    suffixedWords++;
                }
            }
        }

        return suffixedWords;

    }
    
    /*
     * Exercise 6.
     * 
     * Given a string, compute the number of triplets in text.
     */
    
    public int triplets(String text) {

        int triplets = -1;

        if (text != null) {
            String splicedText = "";

            triplets++; //+1 to remove failed test case

            if (text.length() > 2) { //1 or 2-length strings return 0, not -1
                for (int i = 0; i <= text.length() - 3; i++) {
                    splicedText = text.substring(i, i + 3);
                    if (isTriplet(splicedText)) {
                        triplets++;
                    }
                }
            }
        }

        return triplets;

    }
    
    public boolean isTriplet(String splicedText) {

        for (int j = 1; j < 3; j++) { //takes second / third digit
            if (splicedText.charAt(j) != splicedText.charAt(0)) { //checks against first
                return false; //if different, moves on to next triplet check
            } 
        }

        return true; //if all are same, give signal to add to count
    }
    /*
     * Exercise 7.
     * 
     * Given a string, compute the sum of the digits in text.
     */
    
    public long addMe(String text) {

        long sum = -1; 

        if (text != null) { //if text is null, return -1
            char firstChar;

            sum++; // Else, set sum = to correct value

            for (int i = 0; i < text.length(); i++) {
                firstChar = text.charAt(i);
                if (Character.isDigit(firstChar)) {
                  sum += Integer.parseInt(text.substring(i, i+1));
                }
            }
        }

        return sum;
    }
    
    /*
     * Exercise 8.
     * 
     * Given a string, compute the length of the longest sequence.
     */
    
    public long sequence(String text) {

        if (text != null) {

          long longestSequence = 1;
          long sequenceLength = 1;
          char char1 = ' ';
          char char2 = ' ';

          for (int i = 1; i < text.length(); i++ ) {

            char1 = text.charAt(i-1);
            char2 = text.charAt(i);

            if (char1 == char2) {
              sequenceLength -= -1;

              if (sequenceLength > longestSequence) {
                longestSequence = sequenceLength;
              }
             } else {
               sequenceLength = 1;
             }
          }
            if (text.length() == 0) {
              longestSequence = 0;
            }
            return longestSequence;
        }else {
          return -1;
        }
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
