package DSAScalar.IntermediateDSA.Assignment11;

import java.util.Scanner;

public class longestCommonSubstring {
    /*
     * Problem:
     * Given two strings, the task is to find the longest common substring present in the given substringsin same order.
     * 
     * The substring is a contiguous sequence of characters within a string.
     * Ex - String: "Interviewbit", substring: "bit"
     * 
     * Input s1: “dadef”,  s2: “adwce”     Output: 2
     *  Explanation: Substring “ad” of length 2 is the longest.
     * 
     * Input s1: “abcdxyz”, s2: “xyzabcd”   Output: 4
     *  Explanation: Substring “abcd” of length 4 is the longest.
     */
    static int commonsubstring(String s1, String s2){
        int ans = 0;

        for(int i=0; i<s1.length(); i++){
            for(int j=0; j<s2.length(); j++){
                int k=0;
                while((i+k)<s1.length() && (j+k)<s2.length() && s1.charAt(i+k)==s2.charAt(j+k)){
                    k++;
                }
                ans = Math.max(ans, k);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        scan.close();

        // Bruteforce method:
        int commonSubstringlength = commonsubstring(s1, s2);
        // Time complexity: O(n^2 * m), Where n and m are the lengths of sequences.
        // Space complexity: O(1)
        System.out.println(commonSubstringlength);

        //Recursive Approach: 
        //T.C:O(3^(n+m))

        //Dynamic programming:
        // T.C: O(n*m)
        // S.C: O(n*m)

    }
}
