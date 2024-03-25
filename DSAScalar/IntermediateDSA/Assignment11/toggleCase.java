package DSAScalar.IntermediateDSA.Assignment11;

import java.util.Scanner;

public class toggleCase {
    /*
     * Q1. Toggle Case:
     * 
     * Problem Description:
     * You are given a character string A having length N, consisting of only lowercase and uppercase latin letters.
     * You have to toggle case of each character of string A. For e.g 'A' is changed to 'a', 'e' is changed to 'E', etc.
     * 
     * Problem Constraints:
     *  1 <= N <= 105
     *  A[i] ∈ ['a'-'z', 'A'-'Z']
     * 
     * Ex1:  A = "Hello"            Output: hELLO
     * Ex2:  A = "tHiSiSaStRiNg"    Output: ThIsIsAsTrInG 
     */
    static String togglecase(String A){
        StringBuilder sb = new StringBuilder(A);

        for(int i=0; i<A.length(); i++){
            char ch = A.charAt(i);
            if(Character.isUpperCase(ch))
                sb.setCharAt(i,(char) (ch+32));
            else if(Character.isLowerCase(ch))
                sb.setCharAt(i, (char) (ch-32));
        }

        return sb.toString();
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.nextLine();
        scan.close();

        String toggleA = togglecase(A);
        System.out.println(toggleA); 
    }
}
