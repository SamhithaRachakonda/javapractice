package DSAScalar.IntermediateDSA.Assignment1;

public class Assignment1_AdditionalQue {
    /*
     * Problem Description
        You are given an integer A. You have to tell whether it is a perfect number or not.
        Perfect number is a positive integer which is equal to the sum of its proper positive divisors.
        A proper divisor of a natural number is the divisor that is strictly less than the number.

        Problem Constraints: 1 <= A <= 10^6

        Example Input       Example Output
        Input 1: A = 4      Output 1: 0 (For A = 4, the sum of its proper divisors = 1 + 2 = 3, is not equal to 4.)
        Input 2: A = 6      Output 2: 1 (For A = 6, the sum of its proper divisors = 1 + 2 + 3 = 6, is equal to 6. )
     */
    public static boolean solvePerfectNum(int A) {
        int sum = 0;

        for(int i=1; i<=Math.sqrt(A); i++){
            if(A % i == 0){
                if(i == A/i){
                    sum += i;
                }else if(i != 1){
                    sum += (i + (A/i));
                }    
            }
        }
        if(sum+1 == A)
            return true;
        else
            return false;
    }

    /*
     *  Count of primes
        Problem Description:
            You will be given an integer n. You need to return the count of prime numbers less than or equal to n.

        Problem Constraints: 0 <= n <= 10^3

        Example Input       Example Output
        Input 1: 19         Output 1: 8 (Primes <= 19 are 2, 3, 5, 7, 11, 13, 17, 19)
        Input 2: 1          Output 2: 0 (There are no primes <= 1)
     */
    public static int countPrime(int A){
        int countPrime = 0;

        for(int i=2; i<=A; i++){
            int count = 0;
            for(int j=2; j<=i/2; j++){
                if(i%j == 0){
                    count++;
                    break;
                }
            }
            if(count == 0) 
                countPrime++;
        }
        return countPrime;
    }

    public static void main(String[] args){
        int A = 6; // 4 or 28

        System.out.println("Is given number "+ A + " a perfect number? ");
        boolean isPerfectNum = solvePerfectNum(A);
        System.out.println(isPerfectNum);

        int countPrime = countPrime(A);
        System.out.println("The number of prime numbers less than or equal to " + A + " is: " + countPrime);
    }
    
}
