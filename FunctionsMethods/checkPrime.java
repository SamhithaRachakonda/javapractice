package FunctionsMethods;
import java.lang.Math;
import java.util.Scanner;

public class checkPrime {
    public static boolean checkPrimeNumber(int n){
        double sqrt_n = Math.sqrt(n);
        int count = 0;
        if(n==1)
            return false;
            
        for(int i=2; i<=sqrt_n; i++){
            if(n%i == 0){
                count++;
                break;
            }       
        }
        if(count == 0)
            return true;
        else 
            return false;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        boolean checkPrimeNumber = checkPrimeNumber(n);
        System.out.println("Is "+ n +" Prime or not?");
        System.out.println(checkPrimeNumber);
    } 
}
