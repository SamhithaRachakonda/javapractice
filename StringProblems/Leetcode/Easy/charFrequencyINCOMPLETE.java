package StringProblems.Leetcode.Easy;


import java.util.Scanner;

public class charFrequencyINCOMPLETE {
    /*
     * Sort Characters By Frequency:
     * ----------------------------
     * Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.
     * Return the sorted string. If there are multiple answers, return any of them.
     * 
     * 1 <= s.length <= 5 * 105
     * s consists of uppercase and lowercase English letters and digits.
     * 
     * Ex-1: Input: s = "tree"
     * Output: "eert"
     * Explanation: 'e' appears twice while 'r' and 't' both appear once.
     * So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
     * 
     * Ex-2: Input: s = "cccaaa"
     * Output: "aaaccc"
     * Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
     * Note that "cacaca" is incorrect, as the same characters must be together.
     * 
     * Ex-3: Input: s = "Aabb"
     * Output: "bbAa"
     * Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect.
     * Note that 'A' and 'a' are treated as two different characters.
     */

    static String charFreq(String s){
        StringBuilder str = new StringBuilder(s);
        str.append(s.charAt(0));
        //int count = 1;

        for(int i=1; i<str.length(); i++){
            //char curr = str.charAt(i);
            //char prev = str.charAt(i-1);
            

        }
        
        return s;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        String charFrequency = charFreq(s);
        System.out.println(charFrequency);
        System.out.println(charFrequency.length());
    }
}
