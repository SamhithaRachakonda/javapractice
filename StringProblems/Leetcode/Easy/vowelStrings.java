package StringProblems.Leetcode.Easy;

import java.util.Scanner;

public class vowelStrings {
    /*
     * 2586: Count the number of vowel strings in range
     * 
     * You are given a 0-indexed array of string words and two integers left and right.
     * 
     * A string is called a vowel string if it starts with a vowel character and ends with a vowel character where vowel characters are 'a', 'e', 'i', 'o', and 'u'.
     * 
     * Return the number of vowel strings words[i] where i belongs to the inclusive range [left, right].
     * 
     * Constraints:
     *  1 <= words.length <= 1000
     *  1 <= words[i].length <= 10
     *  words[i] consists of only lowercase English letters.
     *  0 <= left <= right < words.length
     * 
     * Example 1:
     *  Input: words = ["are","amy","u"], left = 0, right = 2
     *  Output: 2
     *  Explanation: 
     * - "are" is a vowel string because it starts with 'a' and ends with 'e'.
     * - "amy" is not a vowel string because it does not end with a vowel.
     * - "u" is a vowel string because it starts with 'u' and ends with 'u'.
     * The number of vowel strings in the mentioned range is 2.
     * 
     * Example 2:
     *  Input: words = ["hey","aeo","mu","ooo","artro"], left = 1, right = 4
     *  Output: 3
     *  Explanation: 
     * - "aeo" is a vowel string because it starts with 'a' and ends with 'o'.
     * - "mu" is not a vowel string because it does not start with a vowel.
     * - "ooo" is a vowel string because it starts with 'o' and ends with 'o'.
     * - "artro" is a vowel string because it starts with 'a' and ends with 'o'.
     *  The number of vowel strings in the mentioned range is 3.
     */
    static int vowelStringcount(String[] words, int left, int right){
        int count = 0;
        for(int i=left; i<=right; i++){
            char s = words[i].charAt(0);
            char e = words[i].charAt(words[i].length()-1);
            if("aeiouAEIOU".indexOf(s)>=0  && "aeiouAEIOU".indexOf(e)>=0){
                  count++;  
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String[] words = new String[N];
        for(int i=0; i<N; i++)
            words[i] = scan.next();
        int left = scan.nextInt();
        int right = scan.nextInt();
        scan.close();

        int vowelcount = vowelStringcount(words, left, right);
        System.out.println(vowelcount);       
    }
}
