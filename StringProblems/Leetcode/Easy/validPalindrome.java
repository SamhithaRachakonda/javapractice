package StringProblems.Leetcode.Easy;

import java.util.Scanner;

public class validPalindrome {
    /*
     * 125. Valid Palindrome:
     * 
     * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
     * 
     * Given a string s, return true if it is a palindrome, or false otherwise.
     * 
     * Constraints:
     *  1 <= s.length <= 2 * 10^5
     *  s consists only of printable ASCII characters.
     * 
     * Example 1:
     *  Input: s = "A man, a plan, a canal: Panama"
     *  Output: true
     *  Explanation: "amanaplanacanalpanama" is a palindrome.
     * 
     * Example 2:
     *  Input: s = "race a car"
     *  Output: false
     *  Explanation: "raceacar" is not a palindrome.
     *  
     * Example 3:
     *  Input: s = " "  
     *  Output: true
     *  Explanation: s is an empty string "" after removing non-alphanumeric characters. Since an empty string reads the same forward and backward, it is a palindrome.
     * 
     */
    static boolean palindromeCheck(String s){
        // Converting to lower case
        s = s.toLowerCase();

        // s=s.replaceAll("[^A-Za-z0-9]", "") - replaces all non-aplhanumeric with "".

        StringBuilder sb = new StringBuilder(s);
        // removing non-alphanumeric characters
        for(int i=0; i<sb.length(); i++){
            if(sb.charAt(i)>=97 && sb.charAt(i)<=122)
                continue;
            else if(sb.charAt(i)>=48 && sb.charAt(i)<=57)
                continue;
            else{
                sb.deleteCharAt(i);
                i--;
            }
        }

        int i=0, j=sb.length()-1;
        while(i<j){
            if(sb.charAt(i) != sb.charAt(j))
                return false;
            i++;
            j--;
        }
        
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        if(palindromeCheck(s)){
            System.out.println("True");
        } else{
            System.out.println("False");
        }
    }
}
