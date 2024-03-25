package StringProblems.Leetcode.Easy;

import java.util.Scanner;

public class reverseonlyletters {
    /*
     * 917: Reverse Only Letters:
     * 
     * Given a string s, reverse the string according to the following rules:
     * All the characters that are not English letters remain in the same position.
     * All the English letters (lowercase or uppercase) should be reversed.
     * Return s after reversing it.
     * 
     * Constraints:
     *  1 <= s.length <= 100
     *  s consists of characters with ASCII values in the range [33, 122].
     *  s does not contain '\"' or '\\'.
     * 
     * Example 1:
     *  Input: s = "ab-cd"
     *  Output: "dc-ba"
     * 
     * Example 2:
     *  Input: s = "a-bC-dEf-ghIj"
     *  Output: "j-Ih-gfE-dCba"
     * 
     * Example 3:
     *  Input: s = "Test1ng-Leet=code-Q!"
     *  Output: "Qedo1ct-eeLg=ntse-T!"
     */
    static String reversetheletters(String s){
        int i=0, j=s.length()-1;
        char[] ch = s.toCharArray();
        
        while(i<j){
            if(!Character.isLetter(ch[i]))
                i++;
            else if(!Character.isLetter(ch[j]))
                j--;
            else{
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            }
        }
        return String.valueOf(ch);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        String reverseletters = reversetheletters(s);
        System.out.println(reverseletters);
    }
}
