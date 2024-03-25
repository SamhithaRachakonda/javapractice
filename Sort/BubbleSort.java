package Sort;

public class BubbleSort {
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){    
        // Bubble sort for a given array (Swapping at every element)
        int arr[] = {7, 8, 3, 1, 2};

        // Time complexity = O(n^2) as 2 loops runs for 'n' times
        //??? Space complexity = O(n)??? - sorted elements are stored in new 'n' element array.
        for(int i=0; i<arr.length-1; i++){  
            // loop runs n-1 times
            for(int j=0; j<arr.length-i-1; j++){
                // loop runs n-i-1 times
                if (arr[j] > arr[j+1]) {
                    // swapping at every large number occured in a single iteration.
                    //      => At the end of 1 iteration and many swaps, largest number stored at the end.
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;    
                }
            }
        }
        printArray(arr);
    }   
}
