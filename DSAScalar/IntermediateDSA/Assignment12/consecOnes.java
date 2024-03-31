package DSAScalar.IntermediateDSA.Assignment12;

import java.util.Scanner;

public class consecOnes {
    /*
     * Q1. Length of longest consecutive ones
     * 
     * Given a binary string A. It is allowed to do at most one swap between any 0 and 1. Find and return the length of the longest consecutive 1’s that can be achieved.
     * 
     * Constraints
     *      1 <= length of string <= 1000000
     *      A contains only characters 0 and 1.
     * 
     * Ex1: A = "111000"        Output: 3
     * Ex2: A = "111011101"     Output: 7
     * 
     */
    static int consecutiveOnes(String A){
        int totalOnes = 0;
        int maxlength = 0;

        for(int i=0; i<A.length(); i++){
            if(A.charAt(i)=='1')
                totalOnes++;
        }
        if(totalOnes == A.length())
            return totalOnes;

        for(int i=0; i<A.length(); i++){
            if(A.charAt(i)=='0'){
                int l=0, r=0;
                int j=i+1;
                while(j<A.length() && A.charAt(j)=='1'){
                    r++;
                    j++;
                }
                j=i-1;
                while(j>=0 && A.charAt(j)=='1'){
                    l++;
                    j--;
                }
                if(l+r == totalOnes)
                    maxlength = Math.max(maxlength, l+r);
                else
                    maxlength = Math.max(maxlength, l+r+1);
            }
        }

        return maxlength;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.nextLine();
        scan.close();

        // Time Complexity: O(n) // check why its O(n) and not O(n^2)
        // Space Complexity: O(1)
        System.out.println(consecutiveOnes(A));
    }
}
