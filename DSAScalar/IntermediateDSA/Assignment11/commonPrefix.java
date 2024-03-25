package DSAScalar.IntermediateDSA.Assignment11;

import java.util.Scanner;
import java.util.Arrays;

public class commonPrefix {
    /*
     *Q1. Longest Common Prefix
     * 
     * Problem Description:
     * Given the array of strings A, you need to find the longest string S, which is the prefix of ALL the strings in the array.
     * The longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1 and S2.
     * 
     * Example: the longest common prefix of "abcdefgh" and "abcefgh" is "abc".
     * 
     * Constraints:
     *  0 <= sum of length of all strings <= 1000000
     * 
     * Example 1:
     *  Input: A = ["abcdefgh", "aefghijk", "abcefgh"]
     *  Output: "a"
     * 
     * Example 2:
     *  Input: A = ["abab", "ab", "abcd"];
     *  Output: "ab"
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
