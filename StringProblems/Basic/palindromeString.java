package StringProblems.Basic;

public class palindromeString {
    /*
     * Palindrome String:
     * ------------------
     * A string is called a palindrome string if the reverse of that string is the same as the original string.
     * 
     * Ex - level, madam, nayan, rotor, radar, etc.
     * 
     * Ex - Level   => Output: Palindrome (insensitive to cases of alphabet).
     */

    public static void main(String[] args) {
        String S = "Level";
        S = S.toLowerCase();
        int count=0;
        int i=0, j=S.length()-1;
        while(i<j){
            if(S.charAt(i) != S.charAt(j)){
                count++;
                break;
            }
            i++;
            j--;
        }
        if(count == 0)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
