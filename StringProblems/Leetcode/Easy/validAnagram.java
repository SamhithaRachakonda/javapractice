package StringProblems.Leetcode.Easy;

import java.util.Scanner;

public class validAnagram {
    /*
     * 242: Valid Anagram:
     * 
     * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
     * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
     * 
     * Constraints:
     *      1 <= s.length, t.length <= 5 * 10^4
     *      s and t consist of lowercase English letters.
     * 
     * Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
     * 
     * Example 1:
     *  Input: s = "anagram", t = "nagaram"
     *  Output: true
     * 
     * Example 2:
     *  Input: s = "rat", t = "car"
     *  Output: false
     */
    static boolean validAnagramsascii(String s, String t){
        if(s.length() != t.length())
            return false;
        
        int[] freq = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch-'a']++;
        }
        for(char ch : t.toCharArray()){
            if(freq[ch-'a']==0)
                return false;
            freq[ch-'a']--;
        }
        return true;
    }
    
    // static boolean validAnagrams(String s, String t){
    //     // This method not working for example: s="aa" & t="bb"
    //     char c = 0;
    //     for(char cs: s.toCharArray()) c^=cs;
    //     for(char ct: t.toCharArray()) c^=ct;
    //     return c==0;
    // }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String t = scan.nextLine();
        scan.close();

        // if(validAnagrams(s, t))
        //     System.out.println("True");
        // else
        //     System.out.println("false");

        if(validAnagramsascii(s, t))
            System.out.println("True");
        else
            System.out.println("false");
        
    }
}
