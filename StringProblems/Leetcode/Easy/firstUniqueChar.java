package StringProblems.Leetcode.Easy;

import java.util.Scanner;

public class firstUniqueChar {
    /*
     * 387. First Unique Char in a String:
     * -----------------------------------
     * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
     * 
     * Constraints:
     *      1 <= s.length <= 10^5
     *      s consists of only lowercase English letters.
     * 
     * Example 1:
     * Input: s = "leetcode"
     * Output: 0
     * 
     * Example 2:
     * Input: s = "loveleetcode"
     * Output: 2
     * 
     * Example 3:
     * Input: s = "aabb"
     * Output: -1
     */

    static int firstuniqueChar(String s){
        int[] freq = new int[26];
        char[] ch = s.toCharArray();

        // ch[0]-'a' - gives the index of the required alphabet to be placed in freq array.
        // assume ch[0]=l => 'l'-'a'=(ASCII values) 109-98=11 => at 11th position, 'l' freq is stored.
        for(char chars : ch){
            freq[chars-'a']++; // Updating the character frequencies in freq array.
        }
        for(int i=0; i<ch.length; i++){
            if(freq[ch[i]-'a']==1)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        // this function uses more memory but runtime is less.
        // Write another function to use less memory.
        int index = firstuniqueChar(s); 
        System.out.println(index);
    }
}
