package StringProblems.Leetcode.Easy;

import java.util.Scanner;

public class BreakPalindrome {
    /*
     * Break A Palindrome:
     * ===================
     * Given a palindromic string of lowercase English letters palindrome, replace exactly one character with any lowercase English letter so that the resulting string is not a palindrome and that it is the lexicographically smallest one possible.
     *
     * Return the resulting string. If there is no way to replace a character to make it not a palindrome, return an empty string.
     *
     * A string a is lexicographically smaller than a string b (of the same length) if in the first position where a and b differ, a has a character strictly smaller than the corresponding character in b. For example, "abcc" is lexicographically smaller than "abcd" because the first position they differ is at the fourth character, and 'c' is smaller than 'd'.
     * 
     * Constraints:
     *      1 <= palindrome.length <= 1000
     *      palindrome consists of only lowercase English letters.
     * 
     * Ex-1: Input: palindrome = "abccba"
     * Output: "aaccba"
     * Explanation: There are many ways to make "abccba" not a palindrome, such as "zbccba", "aaccba", and "abacba".
     * Of all the ways, "aaccba" is the lexicographically smallest.
     * 
     * Ex-2: Input: palindrome = "a"
     * Output: ""
     * Explanation: There is no way to replace a single character to make "a" not a palindrome, so return an empty string.
     * 
     */
    static String breakPalindrome(String pd){
        char[] cStr = pd.toCharArray();
        // Any single character is always a palindrome, cannot be changed, so return empty string.
        if(cStr.length<2)
            return "";
        
        // Traversing to check if any char != 'a', so that it can be changed to 'a', which gives lexicographically smallest possible solution.
        for(int i=0; i<cStr.length/2; i++){
            if(cStr[i] != 'a'){
                cStr[i] = 'a';
                return String.valueOf(cStr);
            }
        }

        //If not possible it means string is of format "aaaaaa" or "aaaxaaa" 
        // Changing the above case to break palindrome with lexicographically smallest string possible 
        // Convert to Ex- aaayaab - lexicographically smallest one possible.
        cStr[cStr.length-1] = 'b';
        return String.valueOf(cStr);
    }

    static String breakPalindromesb(String palindrome){
        StringBuilder str = new StringBuilder(palindrome);
        if(str.length()<2)
            return "";  // returning empty string
        
        for(int i=0; i<str.length()/2; i++){ // Traversing half of string length
            char ch = str.charAt(i);
            if(ch != 'a'){ // check condition
                str.setCharAt(i, 'a'); // setting char to 'a'
                return str.toString(); // converting string builder type to string, as return type is string
            }
        }
        str.setCharAt(str.length()-1, 'b'); // If above condition fails, set char to 'b'
        return str.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Check the diff of nextLine() and next()
        // nextLine() - takes the entire line as input
        // next() - takes the input till next space.  
        String palindrome = scan.nextLine();  
        scan.close();

        // function without using string builder
        String notPalindrome = breakPalindrome(palindrome);
        System.out.println(notPalindrome);

        // function using the string builder
        // Using string builder takes less memory compared to char array[].
        String notPalindromesb = breakPalindromesb(palindrome);
        System.out.println(notPalindromesb);

    }
    
}