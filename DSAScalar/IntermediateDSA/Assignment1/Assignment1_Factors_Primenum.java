package DSAScalar.IntermediateDSA.Assignment1;
import java.lang.Math;

public class Assignment1_Factors_Primenum {
    /*
     * 1. Problem Description
        Given an integer A, you need to find the count of it's factors.

        Factor of a number is the number which divides it perfectly leaving no remainder.

        Example : 1, 2, 3, 6 are factors of 6
        Problem Constraints: 1 <= A <= 10^9

        Input Format: First and only argument is an integer A.
        Output Format: Return the count of factors of A.

        Example Input            Example Output
        Input 1: 5               Output 1: 2 (Factors of 5 are 1 and 5.)
        Input 2: 10              Output 2: 4 (Factors of 10 are 1, 2, 5 and 10.)
     */
    public static int solve_factors(int A) {
        int count = 0;

        for(int i=1; i<=Math.sqrt(A); i++){
            if(A % i == 0){
                if(i == A/i)
                    count += 1;
                else
                    count += 2;
            }
        }
        return count;
    }

    /*
     * Problem Description
        Given a number A. Return 1 if A is prime and return 0 if not. 
        Note : The value of A can cross the range of Integer.

        Problem Constraints: 1 <= A <= 10^9

        Input Format: The first argument is a single integer A.
        Output Format: Return 1 if A is prime else return 0.
     */

    public static boolean is_prime(int num_factors){
        if(num_factors == 2)
            return true;
        else
            return false;
    }

    public static void main(String[] args){
        int A = 24;

        int num_factors = solve_factors(A);
        System.out.println(num_factors);

        boolean is_prime = is_prime(num_factors);
        System.out.println(is_prime);
    }

}
