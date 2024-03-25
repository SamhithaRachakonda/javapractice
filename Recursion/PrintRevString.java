package Recursion;

public class PrintRevString {
    public static void PrintRevStringstr(int idx, String str){
        if(idx == 0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        PrintRevStringstr(idx-1, str);
    }
    public static void main(String[] args){
        String str = "abcd";
        PrintRevStringstr(str.length()-1, str);
        // Time Complexity: O(n); n--> length of String
    }
}
