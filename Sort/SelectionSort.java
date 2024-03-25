package Sort;

public class SelectionSort {
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        // Selection sort for a given array - selecting the smallest element in the array (inner loop) and swapping it in ascending order (outer loop).
        int arr[] = {7, 8, 3, 1, 2};

        // Total time complexity: O(n^2)
        for(int i=0; i<arr.length-1; i++){
            // loop runs n-1 times.
            int smallest = i;
            for(int j=i+1; j<arr.length; j++){
                // loop runs throughout the array to find smallest number
                if(arr[j]<arr[smallest]){
                    smallest = j;
                }
            } // => Time complexity: (n-1) times first loop + (n-2) times + (n-3) times + ... + 1 = n*(n-1)/2
            // swapping after finding the smallest number.
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        } // Time Complexity: n times.

        printArray(arr);
    } 
}
