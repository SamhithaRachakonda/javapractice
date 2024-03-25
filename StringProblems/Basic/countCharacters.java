package StringProblems.Basic;

import java.util.Scanner;

public class countCharacters {
    /*
     * Given a string S, count the number of characters in the string ignoring the white spaces.
     * 
     * Ex - "Java is a programming language"
     * count = 26
     */

    static int countChar(String S){
        int count = 0;

        for(int i=0; i<S.length(); i++){
            if(S.charAt(i) != ' ')
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String S = scan.nextLine();
        scan.close();

        int count = countChar(S);
        System.out.println(count);
    }
}
