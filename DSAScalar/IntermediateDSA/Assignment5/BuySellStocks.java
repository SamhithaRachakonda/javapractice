package DSAScalar.IntermediateDSA.Assignment5;

import java.util.ArrayList;
import java.util.Scanner;

public class BuySellStocks {
    /*
     * Q4. Best Time to Buy and Sell Stocks I
     * Problem Description
     * Say you have an array, A, for which the ith element is the price of a given stock on day i.
     * If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
     * Return the maximum possible profit.
     * 
     * Problem Constraints
     * 0 <= N <= 700000
     * 1 <= A[i] <= 10^7
     * 
     * Ex1: A = [1, 2]              => Output: 1
     * Explanation: 
     * Buy the stock on day 0, and sell it on day 1.
     * Ex2: A = [1, 4, 5, 2, 4]     => Output: 4
     * Explanation: 
     * Buy the stock on day 0, and sell it on day 2.
     */
    
    
    static int maxProfit(ArrayList<Integer> A, int N){
        int max_value;
        int maxProfit = 0;
        int profit = 0;

        if(N == 0)
            return maxProfit;
        else    
            max_value = A.get(N-1);

        for(int i=N-2; i>=0; i--){
            if(max_value < A.get(i))
                max_value = A.get(i);
            profit = max_value - A.get(i);
            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
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
        int maxProfit = maxProfit(A, N);
        System.out.println(maxProfit);
    }
}
