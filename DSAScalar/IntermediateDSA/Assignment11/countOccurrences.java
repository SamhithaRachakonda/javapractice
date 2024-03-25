package DSAScalar.IntermediateDSA.Assignment11;

import java.util.Scanner;

public class countOccurrences {
    /*
     * Q2. Count Occurrences
     * 
     * Problem Description
     * Find the number of occurrences of bob in string A consisting of lowercase English alphabets.
     * 
     * Problem Constraints:
     *      1 <= |A| <= 1000
     * 
     * Ex1: "abobc"         Output: 1
     * Ex2: "bobob"         Output: 2
     */
    static int countOccurrences1(String A){
        int l, r;
        int count = 0;

        for(int i=0; i<A.length(); i++){
            l=i-1; r=i+1;
            if(l>=0 && r<A.length() && A.charAt(i)=='o'){
                if(A.charAt(l)=='b' && A.charAt(r)=='b')
                    count++;
            }
        }

        return count;
    }

    static int countOccurrences2(String A){
        int count = 0;

        for(int i=0; i<A.length()-2; i++){
            if(A.substring(i, i+3).equals("bob")){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.nextLine();
        scan.close();

        System.out.println(countOccurrences1(A));

        System.out.println(countOccurrences2(A));
    }
}
