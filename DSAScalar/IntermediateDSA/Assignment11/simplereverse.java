package DSAScalar.IntermediateDSA.Assignment11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class simplereverse {
    /*
     * Q2. Simple Reverse
     * Ref: https://www.scaler.com/topics/reverse-a-string-in-java/
     * Problem Description:
     * Given a string A, you are asked to reverse the string and return the reversed string.
     * 
     * Problem Constraints
     *  1 <= |A| <= 10^5
     *  String A consist only of lowercase characters.
     * 
     * Ex-1:  A = "scaler"      Output:  "relacs"
     * Ex-2:  A = "academy"     Output:  "ymedaca"
     */
    static String reverseconcat(String A){
        String reverse = "";

        // Strings are immutable, so time complexity here is O(n^2)
        // as string concatenation itself takes O(n) time conplexity and it is inside for loop.
        for(int i=0; i<A.length(); i++){
            reverse = A.charAt(i) + reverse;
        }

        return reverse;
    }

    static String reverseCharArr(String A){
        // Extra space added - Space complexity: O(n), n - length of string
        char[] charr = A.toCharArray();
        
        int i=0, j=A.length()-1;
        char temp;
        while(i<j){
            // swapping characters at i and j.
            temp = charr[i];
            charr[i] = charr[j];
            charr[j] = temp;
            // Increment/decrement i, j
            i++;
            j--;
        }
        // Converting charr to string
        return String.valueOf(charr);
    }

    static String reversebytearr(String A){
        byte[] byteinput = A.getBytes();
        byte[] byteresult = new byte[byteinput.length];

        for(int i=0; i<byteinput.length; i++){
            byteresult[i] = byteinput[byteinput.length-1-i];
        }
        
        String reverse = new String(byteresult);
        return reverse;
    }

    static String reversesb(String A){
        StringBuilder reverse = new StringBuilder("");

        for(int i=0; i<A.length(); i++){
            reverse.append(A.charAt(A.length()-1-i));
        }

        return reverse.toString();

        // Direct method to reverse string using string builder
        // return new StringBuilder(A).reverse().toString();
    }

    static String reversearrlist(String A){
        ArrayList<Character> reversed = new ArrayList<>();
        for(char ch : A.toCharArray())
            reversed.add(ch);
        
        Collections.reverse(reversed);

        StringBuilder reversesb = new StringBuilder("");
        for(Character ch : reversed)
            reversesb.append(ch);

        return reversesb.toString();
    }

    static String reversestack(String A){
        Stack<Character> stack = new Stack<>();

        for(char ch : A.toCharArray())
            stack.push(ch);

        StringBuilder reversed = new StringBuilder();
        while(!stack.isEmpty())
            reversed.append(stack.pop());

        return reversed.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.nextLine();
        scan.close();

        // Method-1: string concatenation
        // Time Complexity: O(n^2) (for loop traversing n times and string concat taking O(n) time complexity) 
        // Space Complexity: O(1) (no extra space used)
        System.out.println(reverseconcat(A));

        // Method-2: string to char array to reverse a string
        // Time Complexity: O(n), n-length of string (Since, Traversing the loop n/2 times) 
        // Space Complexity: O(n) (Since using a character array of length 'n')
        System.out.println(reverseCharArr(A));

        // Method-3: bit manipulation to reverse string
        // Time Complexity: O(n), n- length of bytearray
        // Space Complexity: O(n) // using byte array
        System.out.println(reversebytearr(A));
         
        // Method-4: String builder
        // Time Complexity: O(n)
        // Space Complexity: O(n)
        System.out.println(reversesb(A));

        // Method-5: ArrayList
        // Time Complexity: O(n), traversing the independent loops twice
        // Space Complexity: O(n), arraylist + string builder length
        System.out.println(reversearrlist(A));

        // Method-6: String Buffer
        System.out.println(new StringBuffer(A).reverse().toString());

        // Method-7: Stack
        // Time Complexity: O(n)    traversing for stack + stringbuilder
        // Space Complexity: O(n)   stack + stringbuilder
        System.out.println(reversestack(A));
    }   
}
