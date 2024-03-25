package DSAScalar.IntermediateDSA.Assignment1;

public class CountPrime {
    public static int countPrimeNumbers(int A){
        int count = 0;
        double sqrt_A = Math.sqrt(A);

        // ********* Using Class Method
        // for(int i=1; i<=sqrt_A; i++){
        //     if(A%i == 0){
        //         if(i == A/i)
        //             count += 1;
        //         else
        //             count +=2;
        //     }
        // }

        // if(count == 2)
        //     return 1;
        // else
        //     return 0;

        // **** Less Optimization Method
        for(int i=2; i<=sqrt_A; i++){
            if(A%i == 0){
                count++;
                break;
            }
        }

        if(count == 0)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args){
        int A = 24;

        int is_prime = countPrimeNumbers(A);
        System.out.println(is_prime);
    }
}
