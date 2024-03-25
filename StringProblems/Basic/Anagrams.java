package StringProblems.Basic;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    /*
     * Given two Strings, check if two strings are anagrams
     * Anagram: strings having characters with same frequency
     * 
     * Ex- S1="keep", S2="peek"
     * frequencies: k-1, e-2, p-1.
     * S1 & S2 are anagrams
     */
    static boolean anagramOrdern(String s1, String s2){
        if(s1.length() != s2.length())
            return false;
        
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        int[] freq = new int[26];
        for(int i=0; i<s1.length(); i++){
            freq[s1.charAt(i)-'a']++;
        }
        for(int i=0; i<s2.length(); i++){
            if(freq[s2.charAt(i)-'a'] == 0)
                return false;
            freq[s2.charAt(i)-'a']--;
        }
        return true;
    }
    static boolean anagrams(String s1, String s2){
        if(s1.length() != s2.length())
            return false;
        
        //Converting to character array
        char[] S1 = s1.toCharArray();
        char[] S2 = s2.toCharArray();

        //Sorting the array
        Arrays.sort(S1);
        Arrays.sort(S2);

        // Checking if both arrays are equal
        if(Arrays.equals(S1, S2))
            return true;
        else
            return false;

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        scan.close();

        if(anagrams(s1, s2)){
            System.out.println(s1+" and "+s2+" are anagrams");
        }else{
            System.out.println(s1+" and "+s2+" are not anagrams");
        }
        
        if(anagramOrdern(s1, s2)){
            System.out.println(s1+" and "+s2+" are anagrams");
        }else{
            System.out.println(s1+" and "+s2+" are not anagrams");
        }
    }
}
