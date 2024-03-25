package DSAScalar.IntermediateDSA.Assignment5;

import java.util.ArrayList;
import java.util.Scanner;

public class ClosestMinMax {
    /*
     * Q2. Closest MinMax
     * Problem Description
     * Given an array A, find the size of the smallest subarray such that it contains at least one occurrence of the maximum value of the array and at least one occurrence of the minimum value of the array.
     * 
     * Problem Constraints
     * 1 <= |A| <= 2000, where |A| = N
     * 
     * Ex1: A = [1, 3, 2]       => Output: 2
     * Explanation: Take the 1st and 2nd elements as they are the minimum and maximum elements respectievly.
     * Ex2: A = [2, 6, 1, 6, 9] => Output: 3
     * Explanation: Take the last 3 elements of the array.
     * 
     */
    static int method3ordern3(){
        int[] a = {2, 2, 6, 4, 5, 1, 5, 2, 6, 4, 1};
        int n = a.length;
        int max = a[0];
        int min = a[0];
        for(int i=1; i<n; i++){
            if(max < a[i])
                max = a[i];
            if(min > a[i])
                min = a[i];
        }
        int length = 0;
        int minlength = n;
        for(int s=0; s<n; s++){
            for(int e=s; e<n; e++){
                for(int i=s; i<=e; i++){
                    if(a[s]==min){
                        if(a[e] == max){
                            length = e-s+1;
                            minlength = Math.min(minlength, length);
                            break;
                        }
                    }
                    if(a[s]==max){
                        if(a[e] == min){
                            length = e-s+1;
                            minlength = Math.min(minlength, length);
                            break;
                        }
                    }
                }
            }
       }
       return minlength;
    }
    static int method2ordern2(){
        int[] a = {1, 2, 3, 1, 3, 4, 6, 4, 6, 3};
        int n = a.length;
        int max = a[0];
        int min = a[0];
        for(int i=1; i<n; i++){
            if(max < a[i])
                max = a[i];
            if(min > a[i])
                min = a[i];
        }
        int length = 0;
        int maxlength = n;
        for(int s=0; s<n; s++){
            if(a[s] == min || a[s] == max){
                for(int e=s; e<n; e++){
                    if(a[s]==min){
                        if(a[e]==max){
                            length = e-s+1;
                            System.out.println("length1: "+length);
                            maxlength = Math.min(maxlength, length);
                            break;
                        }
                    }
                    if(a[s]==max){
                        if(a[e]==min){
                            length = e-s+1;
                            System.out.println("length2: "+length);
                            maxlength = Math.min(maxlength, length);
                            break;
                        }
                    }
                }    
            }
       }
       return maxlength;
    }

    static int min(ArrayList<Integer> A, int N){
        int min = Integer.MAX_VALUE;

        for(int i=0; i<N; i++){
            if(min > A.get(i))
                min = A.get(i);
        }

        return min;
    }

    static int max(ArrayList<Integer> A, int N){
        int max = Integer.MIN_VALUE;

        for(int i=0; i<N; i++){
            if(max < A.get(i))
                max = A.get(i);
        }

        return max;
    }
    
    static int minsubarrayLength(ArrayList<Integer> A, int N){
        int min = min(A, N);
        int max = max(A, N);
        int min_index = -1;
        int max_index = -1;
        int minlength = N; // It can be assumed as length of array or Integer.MAX_VALUE as we want the minimum length of subarray containing max and min elements.
        
        for(int i=0; i<N; i++){
            if(A.get(i) == min){
                min_index = i;
                if(max_index != -1)
                    minlength = Math.min(minlength, min_index-max_index+1);
            }
            // used if here instead of elseif, considering the condition of both max and min values being equal.
            if(A.get(i) == max){ 
                max_index = i;
                if(min_index != -1)
                    minlength = Math.min(minlength, max_index-min_index+1);
            }
        }
        return minlength;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size for input array:");
        int N = scan.nextInt();

        ArrayList<Integer> A = new ArrayList<>();
        for(int i=0; i<N; i++){
            A.add(scan.nextInt());
        }
        scan.close();

        System.out.println("Input Array: "+ A);
        int minmaxsubarraylength = minsubarrayLength(A, N);
        System.out.println(minmaxsubarraylength);
    }
}
