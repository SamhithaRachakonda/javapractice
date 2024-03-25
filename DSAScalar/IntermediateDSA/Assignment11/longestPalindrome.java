package DSAScalar.IntermediateDSA.Assignment11;

import java.util.Scanner;

public class longestPalindrome {
    /*
     * Q4. Longest Palindromic Substring
     * 
     * Problem Description:
     * Given a string A of size N, find and return the longest palindromic substring in A.
     * Substring of string A is A[i...j] where 0 <= i <= j < len(A)
     * Palindrome string:
     * A string which reads the same backwards. More formally, A is palindrome if reverse(A) = A.
     * Incase of conflict, return the substring which occurs first ( with the least starting index).
     * 
     * Problem Constraints:
     *      1 <= N <= 6000
     * 
     * Ex1: A = "aaaabaaa"          Output: "aaabaaa"
     * Ex2: A = "abba               Output: "abba"
     */
    static int[] palindromelr(String S, int[] a){
        int N = S.length();
        while(a[0]>=0 && a[1]<N){
            if(S.charAt(a[0]) != S.charAt(a[1]))
                return a;
            else{
                a[0]--;
                a[1]++;
            }
        }
        return a;
    }
    
    static String longestPalindromesubstring(String S) {
        int N = S.length();
        int maxlength = 1;
        int[] a = new int[2];
        int l=0, r=0;
        for(int c=0; c<N; c++){
            a[0] = c-1;
            a[1] = c+1;
            a = palindromelr(S, a);
            if(maxlength < a[1]-a[0]-1){
                maxlength = a[1]-a[0]-1;
                l = ++a[0];
                r = --a[1];
            }
            a[0] = c;
            a[1] = c+1;
            a = palindromelr(S, a);
            if(maxlength < a[1]-a[0]-1){
                maxlength = a[1]-a[0]-1;
                l = ++a[0];
                r = --a[1];
            }
        }
        
        return S.substring(l, r+1);
    }

    static String longestpalindrome(String A){
        int N = A.length();
        int ansl=0, ansr=0;
        int maxlength = 1;
        int l,r;

        for(int i=0; i<N; i++){
            // odd length
            l=i-1; r=i+1;
            while(l>=0 && r<N){
                if(A.charAt(l) != A.charAt(r))
                    break;
                l--;
                r++;
            }
            if(maxlength < r-l-1){
                ansl = ++l;
                ansr = --r;
                maxlength = r-l+1;
            }
            // even length
            l=i; r=i+1;
            while(l>=0 && r<N){
                if(A.charAt(l) != A.charAt(r))
                    break;
                l--;
                r++;
            }
            if(maxlength < r-l-1 && A.charAt(l+1)==A.charAt(r-1)){
                ansl = ++l;
                ansr = --r;
                maxlength = r-l+1;
            }
        }
        return A.substring(ansl, ansr+1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        // longest palindrome using arraylist
        // T.C: O(n^2)
        // S.C: O(1)
        String longestPalindrome = longestpalindrome(s);
        System.out.println(longestPalindrome);
        System.out.println(longestPalindrome.length());

        // longest palindrome using arrays and functions.
        // T.C: O(n^2)
        // S.C: O(1)
        String longestPalindromesubstr = longestPalindromesubstring(s);
        System.out.println(longestPalindromesubstr);
    }
}
