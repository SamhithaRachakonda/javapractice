package FunctionsMethods;
import java.util.Scanner;

public class EvenFunction {
    public static boolean evenNumber(int n){
        if(n%2 == 0)
            return true;
        else    
            return false;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        boolean checkEvenNum = evenNumber(n);
        System.out.println("Is "+ n + " an even number or not?");
        System.out.println(checkEvenNum);
    }
}
