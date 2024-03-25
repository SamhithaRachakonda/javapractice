package StringProblems.Leetcode.Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class withoutRepeatChar {
    /*
     * Q) LeetCode - 3 (Medium): Longest Substring without repeating characters.
     * Given a string s, find the length of the longest substring without repeating characters.
     * 
     * Constraints:
     *      0 <= s.length <= 5 * 104
     *      s consists of English letters, digits, symbols and spaces.
     * Example 1:
     * Input: s = "abcabcbb"
     * Output: 3
     * Explanation: The answer is "abc", with the length of 3.
     * 
     * Example 2:
     * Input: s = "bbbbb"
     * Output: 1
     * Explanation: The answer is "b", with the length of 1.
     *
     * Example 3:
     * Input: s = "pwwkew"
     * Output: 3
     * Explanation: The answer is "wke", with the length of 3.
     * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
     * 
     */
    static int longestSubstring(String s){
        // not optimal solution
        int start = 0;
        int end = 0;
        int maxlength = 0;
        List<Character> list = new ArrayList<>();

        while(end < s.length()){
            if(!list.contains(s.charAt(end))){
                list.add(s.charAt(end));
                end++;
                maxlength = Math.max(maxlength, list.size());
                System.out.println(list);
                System.out.println("Maxlength: "+maxlength);
            }else{
                list.remove(Character.valueOf(s.charAt(start)));
                System.out.println(list);
                start++;
            }
        }
        return maxlength;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        int longestSubstring = longestSubstring(s);
        System.out.println(longestSubstring);
    }
}
