package ArraysCoding.ArrayLists;

// importing ArrayLists package:
import java.util.ArrayList;

public class Syntax {
    public static void main(String[] args){
        // wrapper class
        Integer m = Integer.valueOf(4);
        System.out.println(m);

        Float f = Float.valueOf(4.5f);
        System.out.println(f);

        // Creating an array list
        ArrayList<Integer> l1 = new ArrayList<>();
        // ArrayList<Boolean> l2 = new ArrayList<>();
        // ArrayList<Float> l3 = new ArrayList<>();

        // add new element
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);

        // get an element at index i
        System.out.println(l1.get(1)); //6

        // print with for loop
        for(int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i) + " ");  // 5 6 7 8
        }
        System.out.println();

        // Printing the array list directly
            // No need to use for loop for arraylists.
        System.out.println(l1);  // [5, 6, 7, 8]

        // adding the element at some index 'i' i.e, [5 100 6 7 8]
        l1.add(1,100);
        System.out.println(l1);

        // modyfying element at index i
        l1.set(1, 10);
        System.out.println(l1);

        // removing the element at index i
        l1.remove(1);
        System.out.println(l1);

        // removing an element e
        System.out.println(l1.remove(Integer.valueOf(7)));
        System.out.println(l1);

        // Checking if an element exists
        boolean ans = l1.contains(Integer.valueOf(6));
        System.out.println(ans);

        // If you don't specify class, you can put anything inside 'l'
        ArrayList<Object> l = new ArrayList<>();
        l.add("pqres");
        l.add(1);
        l.add(true);
        System.out.println(l);
    }
}
