package StringProblems.Leetcode.Easy;

import java.util.HashMap;
import java.util.Scanner;

public class isomorphicStrings {
    /*
     * 205: Isomorphic Strings:
     * 
     * Given two strings s and t, determine if they are isomorphic.
     * 
     * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
     * 
     * All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
     * 
     * Constraints:
     *      1 <= s.length <= 5 * 10^4
     *      t.length == s.length
     *      s and t consist of any valid ascii character.
     * 
     * Example 1:
     *  Input: s = "egg", t = "add"
     *  Output: true
     * 
     * Example 2:
     *  Input: s = "foo", t = "bar"
     *  Output: false
     * 
     * Example 3:
     *  Input: s = "paper", t = "title"
     *  Output: true
     */
    static boolean validIsomorphic(String s, String t){
        HashMap<Character, Character> map = new HashMap<>();
        
        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                if(!map.get(s.charAt(i)).equals(t.charAt(i)))
                    return false;
            }else{
                if(map.containsValue(t.charAt(i)))
                    return false;
                map.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String t = scan.nextLine();
        scan.close();

        // need to write more optimised function.
        if(validIsomorphic(s, t))
            System.out.println("True");
        else    
            System.out.println("False");
    }
}
