package ArraysCoding.ArrayLists;

import java.util.ArrayList;
import java.util.Collections; // to call the method to reverse an array

public class reverseArrayList {
    /*
     * Problem Statement:
     * Write a program to reverse the given ArrayList.
     * 
     * Ex: arr = {0, 10, 3, 5, 22, 10}
     * Output: {10, 22, 5, 3, 10, 0}
     * 
     */

    static void reverseList(ArrayList<Integer> A){
        int i=0, j=A.size()-1;

        while(i<j){
            Integer temp = Integer.valueOf(A.get(i));
            A.set(i, A.get(j));
            A.set(j, temp);
            i++;
            j--;
        }
    }

    public static void main(String[] args){
        ArrayList<Integer> A = new ArrayList<>();
        A.add(0);
        A.add(10);
        A.add(3);
        A.add(5);
        A.add(22);
        A.add(10);

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
