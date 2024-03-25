package StringProblems.Leetcode.Easy;

import java.util.HashMap;
import java.util.Scanner;

public class wordPattern {
    /*
     * Given a pattern and a string s, find if s follows the same pattern.
     * 
     * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
     * 
     * Constraints:
     *  1 <= pattern.length <= 300
     *  pattern contains only lower-case English letters.   
     *  1 <= s.length <= 3000
     *  s contains only lowercase English letters and spaces ' '.   
     *  s does not contain any leading or trailing spaces.  
     *  All the words in s are separated by a single space.
     * 
     * Example 1:
     *  Input: pattern = "abba", s = "dog cat cat dog"
     *  Output: true    
     *  
     * Example 2:
     *  Input: pattern = "abba", s = "dog cat cat fish"
     *  Output: false
     * 
     * Example 3:
     *  Input: pattern = "aaaa", s = "dog cat cat dog"
     *  Output: false
     */
    static boolean wordpattern(String pattern, String s){
        String[] arr = s.split("\\s");
        if(arr.length!=pattern.length())
            return false;
        
        HashMap<Character,String> hm = new HashMap<>();
        
        for(int i=0; i<pattern.length(); i++){
            if(hm.containsKey(pattern.charAt(i))){
                if(!hm.get(pattern.charAt(i)).equals(arr[i])){
                    System.out.println(hm);
                    return false;
                }
            }
            else{
                if(hm.containsValue(arr[i])){
                    System.out.println(hm);
                    return false;
                }
                System.out.println(hm);
                hm.put(pattern.charAt(i), arr[i]);
            }
        }
        
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String pattern = scan.nextLine();
        String s = scan.nextLine();
        scan.close();

        if(wordpattern(pattern, s)){
            System.out.println("True");
        } else{
            System.out.println("False");
        }
        
    }
}
