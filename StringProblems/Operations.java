package StringProblems;

import java.util.Scanner;

public class Operations {
    static String operations(String A){
        StringBuilder S = new StringBuilder(A);
        S = S.append(S);
        System.out.println(S);
        for(int i=0; i<S.length(); i++){
            char ch = S.charAt(i);
            System.out.println("Delete: "+ ch);
            if(ch>=65 && ch<=90){
                S.deleteCharAt(i);
                i--;
                System.out.println("String delete: "+S);
            }
        }
        
        System.out.println(S);
        for(int i=0; i<S.length(); i++){
            char ch = S.charAt(i);
            System.out.println("#: "+ ch);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                S.deleteCharAt(i);
                S.insert(i, '#');
            }
        }
        System.out.println(S);
        return S.toString();
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        String Stringout = operations(s);
        System.out.println(Stringout);
    }
}
