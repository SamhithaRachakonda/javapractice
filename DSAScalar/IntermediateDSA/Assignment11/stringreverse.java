package DSAScalar.IntermediateDSA.Assignment11;

import java.util.Scanner;

public class stringreverse {
    /*
     * Q3. Reverse the String
     * 
     * Problem Description:
     * You are given a string A of size N.
     * Return the string A after reversing the string word by word.
     * NOTE:
     * A sequence of non-space characters constitutes a word.
     * Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
     * If there are multiple spaces between words, reduce them to a single space in the reversed string.
     * 
     * Problem Constraints:
     * 1 <= N <= 3 * 10^5
     * 
     * Ex1: A = "the sky is blue"       Output: "blue is sky the"
     * Ex2: A = "this is ib"            Output: "ib is this"
     */
    static String stringReverse(String A){
        String[] s = A.trim().split("\\s+");

        int i=0, j=s.length-1;
        while(i<j){
            String temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }

        return String.join(" ", s);
    }

    static String reversewords(String s){
        StringBuilder input = new StringBuilder(s);
        input.reverse();
        StringBuilder str = new StringBuilder("");
        StringBuilder ans = new StringBuilder("");
        boolean flag = false;

        // Reversing string char by char
        for(int i=0; i<s.length(); i++){
            char ch = input.charAt(i);
            if(i<input.length() && ch==' '){
                if(flag){
                    ans.append(str.reverse());
                    ans.append(" ");
                    str = new StringBuilder("");
                }
                flag = false;
            }
            else if(i<input.length() && ch!=' '){
                str.append(ch);
                flag = true;
            }
        }
        if(!str.isEmpty()) ans.append(str.reverse());
        if(ans.charAt(ans.length()-1)==' ') ans.deleteCharAt(ans.length()-1);
        return ans.toString();
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.nextLine();
        scan.close();

        System.out.println(stringReverse(A));

        System.out.println(reversewords(A));
    }
}
