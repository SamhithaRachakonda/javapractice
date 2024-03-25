package DSAScalar.IntermediateDSA.Assignment11;

import java.util.Arrays;
import java.util.Scanner;

public class Stringsort {
    /*
     * Problem description:
     * Given a string S of lowercase English characters ‘a’ – ‘z’. The task is to sort the string.
     * 
     * Ex-1:    Input:  S = “dceabb”     Output: “abbcde”
     * Ex-2:    Input:  S = “eeetag”     Output: “aeeegt”
     */

    static final int MAX_CHAR = 26;

    static String sortedStringInbuilt(String s){
        char[] ch = s.toCharArray();
        // Most efficient time complexity for inbuilt sorting: nlogn - n=length of string
        // Space complexity: Should we consider char array or not?
        Arrays.sort(ch);  
        return String.valueOf(ch);
    }

    static String sortedStringHashing(String s){
        StringBuilder sb = new StringBuilder("");
        //Initialise a frequency array of size 26.
        int[] letters = new int[MAX_CHAR];

        //Iterate through the string and count the frequency of each character.
        for(char val : s.toCharArray())
            letters[val-'a']++;   // index represents character here

        //Run a loop from i = 0 till 26 and for each i, print the corresponding character freq[i] times.
        for(int i=0; i<MAX_CHAR; i++){
            for(int j=0; j<letters[i]; j++){
                sb.append((char)(i+'a'));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        // Method -1: Inbuilt sorting
        String sortedInbuilt = sortedStringInbuilt(s);
        // Time Complexity: O(NlogN), where N is the length of the string.
        // Space Complexity: O(1) since no extra space is used.
        System.out.println(sortedInbuilt);

        // Method -2: Hashing
        String sortedHashing = sortedStringHashing(s);
        // Time Complexity: O(N * 26), where N is the length of the string.
        // Space Complexity: O(1) since constant space of size 26 is used.
        System.out.println(sortedHashing);

    }
}
