package StringProblems.Leetcode.Easy;

import java.util.Scanner;

public class ReverseWords {
    /*
     * Given an input string s, reverse the order of the words.
     *
     * A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
     * 
     * Return a string of the words in reverse order concatenated by a single space.
     * 
     * Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.
     * 
     * Constraints:
     * 1 <= s.length <= 104
     * s contains English letters (upper-case and lower-case), digits, and spaces ' '.
     * There is at least one word in s.
     * 
     * Ex-1: Input: s = "the sky is blue"
     * Output: "blue is sky the"
     * 
     * Ex-2: Input: s = "  hello world  "
     * Output: "world hello"
     * Explanation: Your reversed string should not contain leading or trailing spaces.
     * 
     * Ex-3: Input: s = "a good   example"
     * Output: "example good a"
     * Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
     */
    static String reverseEachWords(String s){
        StringBuilder str = new StringBuilder("");
        String ans = "";

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch != ' '){
                str.append(ch); // appending ch to form a word till it reaches space
            }else if(i<s.length() && (ch==' ' && s.charAt(i+1)==' '))
                i++;
            else{
                str.reverse();
                ans += str + " ";
                str = new StringBuilder("");
            }
        }
        if(!str.isEmpty()) ans += str.reverse();
        return ans;
    }

    static String reverseWordstwopointers(String s){
        String[] str = s.trim().split("\\s+");
        int i=0, j=str.length-1;
        while(i<j){
            String t = str[i];
            str[i] = str[j];
            str[j] = t;
            i++;
            j--;
        }
        return String.join(" ", str);
    }

    static String reverseWords(String s){
        // Using more memory, try to reduce the memory.
        StringBuilder input = new StringBuilder(s);
        input.reverse();
        StringBuilder str = new StringBuilder("");
        StringBuilder ans = new StringBuilder("");
        boolean flag = false;

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
        String s = scan.nextLine();
        scan.close();

        String reverseWord = reverseWords(s);
        System.out.println(reverseWord);
        System.out.println(reverseWord.length());
    }
}
