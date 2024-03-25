package DSAScalar.IntermediateDSA.Assignment11;

import java.util.Scanner;

public class Operations {
    /*
     * Q5. String operations
     * 
     * Problem Description
     * Akash likes playing with strings. One day he thought of applying following operations on the string in the given order:
     * 
     * Concatenate the string with itself.
     * Delete all the uppercase letters.
     * Replace each vowel with '#'.
     * You are given a string A of size N consisting of lowercase and uppercase alphabets. Return the resultant string after applying the above operations.
     * 
     * NOTE: 'a' , 'e' , 'i' , 'o' , 'u' are defined as vowels.
     * 
     * Problem Constraints:
     *      1<=N<=100000
     * 
     * Ex1: A="aeiOUz"          Output: "###z###z"
     * Ex2: A="AbcaZeoB"        Output: "bc###bc###"
     */
    static String operations(String A){
        StringBuilder S = new StringBuilder(A);

        System.out.println(S);
        for(int i=0; i<S.length(); i++){
            char ch = S.charAt(i);
            if(Character.isUpperCase(ch)){
                S.deleteCharAt(i);
                i--;
            }
        }
        
        for(int i=0; i<S.length(); i++){
            char ch = S.charAt(i);
            if("aeiou".contains(Character.toString(ch))){
                S.setCharAt(i, '#');
            }
        }

        return S.append(S).toString();
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        String Stringout = operations(s);
        System.out.println(Stringout);
    }
}
