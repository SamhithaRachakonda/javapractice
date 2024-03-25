package StringProblems.Leetcode.Easy;

import java.util.Scanner;

public class reverseVowels {
    /*
     * Given a string s, reverse only all the vowels in the string and return it.
     * 
     * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
     * 
     * Constraints:
     *      1 <= s.length <= 3 * 10^5
     *      s consist of printable ASCII characters.
     * 
     * Example 1:   
     * Input: s = "hello"   
     * Output: "holle"
     * 
     * Example 2:
     * Input: s = "leetcode"
     * Output: "leotcede"
     */
    static boolean isVowel(char ch){
        // if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
        //     return true;
        // } else if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
        //     return true;
        // } else{
        //     return false;
        // }
        return "aeiouAEIOU".indexOf(ch)>=0;
    }

    static String reversetheVowels(String s){
        char[] ch = s.toCharArray();
        int i=0, j=ch.length-1;
        // T.C: O(n)
        // S.C: O(n)
        while(i<j){
            if(isVowel(ch[i]) && isVowel(ch[j])){
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                    i++;
                    j--;
            } else if(!isVowel(ch[i])){
                i++;
            } else if(!isVowel(ch[j])){
                j--;
            }
        }

        return String.valueOf(ch);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        String reversevowels = reversetheVowels(s);
        System.out.println(reversevowels);
    }
    
}
