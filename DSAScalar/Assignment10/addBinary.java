package DSAScalar.Assignment10;

public class addBinary {
    /*
     * Q7. Add Binary Strings
     * Problem Description:
     * Given two binary strings A and B. Return their sum (also a binary string).
     * 
     * Problem Constraints:
     * 1 <= length of A <= 105
     * 1 <= length of B <= 105
     * A and B are binary strings
     * 
     * Input 1: A = "100", B = "11"  Output: 111
     * Explanation: The sum of 100 and 11 is 111.
     * Input 2: A = "110", B = "10"  Output: 1000
     */
    static String AddBinary(String A, String B) {
        int i = A.length()-1;
        int j = B.length()-1;
        
        StringBuilder C = new StringBuilder();
        int carry = 0;

        while(i>=0 || j>=0){
            int sum = carry;
            if(i>=0) sum += A.charAt(i) - '0';
            if(j>=0) sum += B.charAt(j) - '0';

            carry = sum/2;
            C.append(sum%2);

            i--;
            j--;
        }

        if(carry!=0)
            C.append(carry);
        
        return C.reverse().toString();
    }
    public static void main(String[] args){
        //Scanner scan = new Scanner(System.in);
        String A = "110";
        String B = "10";
        
        
        //scan.close();

        String addBinary = AddBinary(A, B);
        System.out.println("Binaru addition: " + addBinary);
    }
}
