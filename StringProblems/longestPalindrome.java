package StringProblems;

import java.util.Scanner;

public class longestPalindrome {
    
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
                System.out.println("Odd length: l&r: "+ l + " " + r);
            }
            if(maxlength < r-l-1){
                ansl = ++l;
                ansr = --r;
                maxlength = r-l+1;
                System.out.println("odd length: "+ ansl + " " + ansr);
                System.out.println("Maxlength odd : "+ maxlength);
            }
            // even length
            l=i; r=i+1;
            while(l>=0 && r<N){
                if(A.charAt(l) != A.charAt(r))
                    break;
                l--;
                r++;
                System.out.println("Even length: l&r: "+ l + " " + r);
            }
            if(maxlength < r-l-1 && A.charAt(l+1)==A.charAt(r-1)){
                ansl = ++l;
                ansr = --r;
                maxlength = r-l+1;
                System.out.println("even length: "+ ansl + " " + ansr);
                System.out.println("Maxlength even : "+ maxlength);
            }
        }
        System.out.println("left & right: "+ ansl +" " + ansr);
        return A.substring(ansl, ansr+1);
        //return A;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        String longestPalindrome = longestpalindrome(s);
        System.out.println(longestPalindrome);
        System.out.println(longestPalindrome.length());
    }
}
