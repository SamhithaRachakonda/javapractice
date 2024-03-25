package FunctionsMethods;

import java.util.*;

public class simplefunction{
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }

    public static void main(String[] args){
        // Input steps
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        scan.close();

        printMyName(name);    
    }
}
