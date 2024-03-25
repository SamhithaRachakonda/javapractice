package Sort;

public class InsertionSort {
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        // Insertion sort for a given array - Comparing sorted and unsorted array and inserting the smallest in the sorted array.
        int arr[] = {7, 8, 3, 1, 2};

        // Total time complexity: ??
        for(int i=1; i<arr.length; i++){
           int current = arr[i];
           int j=i-1;
           while(j>=0 && current < arr[j]){
            // Replacing j+1 th element
                arr[j+1] = arr[j];
                j--;
           }
           // actual sorted element placed in ascending order.
           arr[j+1] = current;
        } 
        printArray(arr);
    } 
}
