package DSAScalar.IntermediateDSA.Assignment11;

import java.util.Scanner;

public class amazingsubarrays {
    /*
     * Q3. Amazing Subarrays:
     * 
     * You are given a string S, and you have to find all the amazing substrings of S.
     * An amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).
     * 
     * Constraints
     *      1 <= length(S) <= 1e6
     *      S can have special characters
     * 
     * Input:   ABEC
     * Output:  6
     * Explanation:
     * Amazing substrings of given string are :
     * 1. A
     * 2. AB
     * 3. ABE
     * 4. ABEC
     * 5. E
     * 6. EC
     * here number of substrings are 6 and 6 % 10003 = 6.
     */
    static int amazingsubarr(String A){
        int count = 0;

        for(int i=0; i<A.length(); i++){
            char ch = A.charAt(i); 
            if("aeiouAEIOU".contains(Character.toString(ch))){
                count%=10003;
                count += A.length()-i;
            }
        }

        return count%10003;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.nextLine();
        scan.close();

        System.out.println(amazingsubarr(A));
    }
}
