package Recursion;

public class PrintOccString {
    // Find the first and last occurances of a given element in string.
    // First and last occured elements should be static variables, as we don't initialize them at every recursion. They should be constant.
    public static int first = -1;  // just defined an invalid value, not to get confused by idx.
    public static int last = -1;
    
    public static void findOccStringstr(String str, int idx, char element){
        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == element){
            if(first == -1){
                first = idx;
            }else{
                last = idx;
            }
        }
        findOccStringstr(str, idx+1, element);
    }
    public static void main(String[] args){
        String str = "abaacdaefaaha";
        findOccStringstr(str, 0, 'a');
        // Time Complexity: O(n) --> 'n' = length of String.
    }  
}
