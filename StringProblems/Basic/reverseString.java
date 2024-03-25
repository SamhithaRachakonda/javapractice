package StringProblems.Basic;

import java.util.Scanner;

public class reverseString {
    /*
     * Reverse the given string provided
     * Ex - Interview
     *  => Output: weivretnI
     */
    static String reverseaStringsb(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1; i>=0; i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();

        // to reverse a string builder: sb.reverse(s) method can be used directly.
    }
    
    static String reverseaStringch(String s){
        char[] ch = s.toCharArray();
        int i=0, j=ch.length-1;
        while(i<j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        return String.valueOf(ch);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        String reversedStringch = reverseaStringch(s);
        System.out.println(reversedStringch);
        
        String reversedStringsb = reverseaStringsb(s);
        System.out.println(reversedStringsb);
    }
}
