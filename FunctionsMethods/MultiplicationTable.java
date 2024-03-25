package FunctionsMethods;

import java.util.Scanner;

public class MultiplicationTable {
    public static void multiplicationTableN(int n){
        for(int i=1; i<=10; i++){
            System.out.println(n +" * "+ i + " = "+ n*i);
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        multiplicationTableN(n);
    }
}
