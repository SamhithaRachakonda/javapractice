package DSAScalar.IntermediateDSA.Assignment11;

import java.util.ArrayList;
import java.util.Scanner;

public class isalnum {
    /*
     * Q4. Isalnum()
     * 
     * Problem Description:
     * You are given a function isalpha() consisting of a character array A.
     * Return 1 if all the characters of a character array are alphanumeric (a-z, A-Z, and 0-9) else, return 0.
     * 
     * Problem Constraints:
     *      1 <= |A| <= 10^5
     * 
     * Ex1: A = ['S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '0'] 
     * Output: 1
     * 
     * Ex2: A = ['S', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0']
     * Output: 0
     */
    static int isalphanum(ArrayList<Character> A){
        //String S = A.toString().replaceAll("\\[|\\]|,| ","");  - worked

        //String S = String.valueOf(A).replaceAll("\\[|\\]|,| ","");  - worked
        //System.out.println(S);

        StringBuilder sb = new StringBuilder("");
        for(char ch : A){
            sb.append(ch);
        }
        String S = sb.toString();
        
        if(S.matches("[a-zA-Z0-9]+"))
            return 1;
        else
            return 0;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String S = scan.nextLine();
        ArrayList<Character> A = new ArrayList<>();
        for(int i=0; i<S.length()-1; i++){
            A.add(S.charAt(i));
        }
        scan.close();

        System.out.println(isalphanum(A));
    }
}
