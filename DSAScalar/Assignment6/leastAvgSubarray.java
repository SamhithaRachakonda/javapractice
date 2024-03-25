package DSAScalar.Assignment6;

import java.util.ArrayList;
import java.util.Scanner;

public class leastAvgSubarray {
    /*
     * Q3. Subarray with least average
     * Problem Description:
     * Given an array A of size N, find the subarray of size B with the least average.
     * 
     * Problem Constraints:
     * 1 <= B <= N <= 10^5
     * 10^-5 <= A[i] <= 10^5
     * 
     * Output Format
     * Return the index of the first element of the subarray of size B that has least average.
     * Array indexing starts from 0.
     * 
     * Ex1: A = [3, 7, 90, 20, 10, 50, 40], B = 3          Output: 3
     * Explanation: 
     * Subarray between indexes 3 and 5
     * The subarray {20, 10, 50} has the least average among all subarrays of size 3.
     * 
     * Ex2: A = [3, 7, 5, 20, -10, 0, 12], B = 2           Output: 4
     * Explanation:
     * Subarray between [4, 5] has minimum average
     ******
     * The least avg can also be calculated with least sum as length is constant. Below code does the same:
     * int N = A.size();
        int sum = 0;

        for(int i=0; i<B; i++){
            sum += A.get(i);
        }
        int index = 0;
        int min_sum = sum;

        int i=1, j=B;
        while(j<N){
            sum = sum - A.get(i-1) + A.get(j);
            if(min_sum > sum){
                min_sum = sum;
                index = i;
            }
            i++;
            j++;
        }
        return index;
     */
    static int leastAverage(int N, ArrayList<Integer> A, int B){
        int index = 0;
        int sum = 0;

        for(int i=0; i<B; i++)
            sum += A.get(i);
        double avg = (double) sum/B;
        double leastAvg = avg;

        int i=1, j=B;
        while(j<N){
            sum = sum - A.get(i-1) + A.get(j);
            avg = (double) sum/B;
            System.out.println("Avg: "+avg);
            if(avg < leastAvg){
                leastAvg = avg;
                index = i;
                System.out.println("least avg: "+ leastAvg +" "+ i);
            }
            i++;
            j++;
        }
        
        return index;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        ArrayList<Integer> A = new ArrayList<>();

        for(int i=0; i<N; i++)
            A.add(scan.nextInt());
        
        int B = scan.nextInt();
        scan.close();

        int leastAvgIndex = leastAverage(N, A, B);
        System.out.println("The least average subarray starts with index: "+leastAvgIndex);
    }
}
