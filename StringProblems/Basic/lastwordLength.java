package StringProblems.Basic;

import java.util.Scanner;

public class lastwordLength {
    /*
     * Q). Length Of Last Word:
     * ------------------------
     * Given a string s consisting of words and spaces, return the length of the last word in the string.
     * A word is a maximal substring consisting of non-space characters only.
     * 
     * Constraints:
     *      1 <= s.length <= 10^4
     *      s consists of only English letters and spaces ' '.
     *      There will be at least one word in s.
     * 
     * Example 1:
     * Input: s = "Hello World"
     * Output: 5
     * Explanation: The last word is "World" with length 5.
     *
     * Example 2:
     * Input: s = "   fly me   to   the moon  "
     * Output: 4
     * Explanation: The last word is "moon" with length 4.
     *
     * Example 3:
     * Input: s = "luffy is still joyboy"
     * Output: 6
     * Explanation: The last word is "joyboy" with length 6.
     * 
     */
    static int lastWordArray(String S){
        // taking more memory than required.
        String[] words = S.trim().split("\\s+");
        return words[words.length-1].length();
    }

    static String lastWord(String S){
        StringBuilder lastword = new StringBuilder("");
        S = S.trim(); // removes the leading and trailing spaces.
        for(int i=S.length()-1; i>=0; i--){ // traversing the string from last
            if(S.charAt(i) != ' '){ // getting the characters of last word
                lastword.append(S.charAt(i));
            } else{
                break;
            }
        }
        return lastword.reverse().toString(); 
        // return last word after reversing as we are reading the word in the reverse order in the loop.
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        String lastWord = lastWord(s);
        System.out.println(lastWord);
        System.out.println(lastWord.length());

        int count = lastWordArray(s);
        System.out.println(count);
    }
}
