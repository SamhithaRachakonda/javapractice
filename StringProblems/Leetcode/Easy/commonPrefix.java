package StringProblems.Leetcode.Easy;

import java.util.Scanner;
import java.util.Arrays;

public class commonPrefix {
    /*
     *  14. Longest Common Prefix:
     * 
     * Write a function to find the longest common prefix string amongst an array of strings.
     * If there is no common prefix, return an empty string "".
     * 
     * Constraints:
     *  1 <= strs.length <= 200
     *  0 <= strs[i].length <= 200
     *  strs[i] consists of only lowercase English letters.
     * 
     * Example 1:
     *  Input: strs = ["flower","flow","flight"]
     *  Output: "fl"
     * 
     * Example 2:
     *  Input: strs = ["dog","racecar","car"]
     *  Output: ""
     *  Explanation: There is no common prefix among the input strings.
     */
    static String commonword(String s1, String s2){
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<Math.min(s1.length(), s2.length()); i++){
            if(s1.charAt(i) == s2.charAt(i)){
                sb.append(s1.charAt(i));
            } else{
                break;
            }
        }

        return sb.toString();
    }
    
    static String commonPrefixs(String[] s){
        String ans = s[0];

        for(int i=1; i<s.length; i++){
            ans = commonword(ans, s[i]);
        }

        return ans;
    }

    static String commonPrefixSort(String[] s){
        Arrays.sort(s); // Collections.sort() for arraylist.
        String s1 = s[0];
        String s2 = s[s.length-1];
        int idx = 0;

        while(idx<s1.length() && idx<s2.length()){
            if(s1.charAt(idx) == s2.charAt(idx))
                idx++;
            else    
                break;
        }
        return s1.substring(0, idx);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        
        String[] s = new String[N];
        for(int i=0; i<N; i++){
            s[i] = scan.next();
        }

        scan.close();

        // Method 1 T.C: O(m*n) - nested loop
        String commonprefix = commonPrefixs(s);
        System.out.println(commonprefix);

        //Method 2 T.C: O(m*nlogn) for sorting
        // m - string length, char by char comparison for sorting
        // n - length of string array 
        String commonprefixsort = commonPrefixSort(s);
        System.out.println(commonprefixsort);
    }
}
