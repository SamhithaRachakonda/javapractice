package StringProblems.Leetcode.Easy;

import java.util.Scanner;

public class firstOccIndex {
    /*
     * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
     *
     * Constraints:
     * 1 <= haystack.length, needle.length <= 104
     * haystack and needle consist of only lowercase English characters.
     * 
     * Example 1:
     * Input: haystack = "sadbutsad", needle = "sad"
     * Output: 0
     * Explanation: "sad" occurs at index 0 and 6.
     * The first occurrence is at index 0, so we return 0.
     * 
     * Example 2:
     * Input: haystack = "leetcode", needle = "leeto"
     * Output: -1
     * Explanation: "leeto" did not occur in "leetcode", so we return -1.
     */
    static int indexFirstOcc(String haystack, String needle){

        for(int i=0; i<haystack.length()-needle.length()+1; i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                if(haystack.substring(i, needle.length()+i).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String haystack = scan.nextLine();
        String needle = scan.nextLine();
        scan.close();

        int indexoffirstocc = indexFirstOcc(haystack, needle);
        System.out.println(indexoffirstocc);

        // Simple method to get the first occurrence of needle.
        int index = haystack.indexOf(needle);
        System.out.println(index);
    }
}
