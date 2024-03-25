package FunctionsMethods;
import java.util.Scanner;

public class Add2Number {
    public static int calculateSum(int a, int b){
        // return a+b;
        int sum = a+b;
        return sum;
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();

        int sum = calculateSum(a,b);
        System.out.println("Sum of 2 numbers is: " + sum);
    }
}
