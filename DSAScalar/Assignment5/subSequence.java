package DSAScalar.Assignment5;

public class subSequence {
    /*
     * Q6. Special Subsequences "AG"
     * Problem Description
     * You have given a string A having Uppercase English letters.
     * You have to find how many times subsequence "AG" is there in the given string.
     * 
     * NOTE: Return the answer modulo 10^9 + 7 as the answer can be very large.
     * 
     * Problem Constraints
     * 1 <= N <= 10^5
     * 
     * Ex1:  A = "ABCGAG"       => Output: 3
     * Explanation:  Subsequence "AG" is 3 times in given string 
     * Ex2:  A = "GAB"          => Output: 0
     * Explanation: There is no subsequence "AG" in the given string.
     */
    
    static int subsequenceFreq(String A){
        int N = A.length();
        int count_A = 0;
        int ans = 0;;

        for(int i=0; i<N; i++){
            if(A.charAt(i) == 'A'){
                count_A %= 1000000007;
                count_A++;
            }
            if(A.charAt(i) == 'G'){
                ans %= 1000000007;
                ans += count_A;
            }
        }
        
        return ans % 1000000007;
    }
    

    public static void main(String[] args){
        String A = "GAB";

        System.out.println("Input String: "+ A);
        int subsequencefreq = subsequenceFreq(A);
        System.out.println(subsequencefreq);
    }
}
