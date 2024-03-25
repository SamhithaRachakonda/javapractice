package ArraysCoding.ArrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class stringsDecOrder {
    /*
     * Problem Statement:
     * Write a program to sort an ArrayList of Strings in descending order
     * 
     * Ex: arr = {0, 10, 3, 5, 22, 10}
     * Output: {10, 22, 5, 3, 10, 0}
     * 
     */

    public static void main(String[] args){
        ArrayList<String> A = new ArrayList<>();
        A.add("Welcome");
        A.add("To");
        A.add("Java");
        A.add("Programming");
        A.add("with");
        A.add("ArrayLists.");

        System.out.println("Original List: "+ A);
        // reverseList(A);
        Collections.reverse(A);
        System.out.println("Reversed List: "+ A);
        Collections.sort(A); // sorting the array list with collections class
        System.out.println("Ascending Order: "+ A);
        Collections.sort(A, Collections.reverseOrder());
        System.out.println("Descending Order: "+ A);
    }

}
