package ArraysCoding.Basic;

import java.util.Scanner;

public class TargetSumTriplets {
    static int TargetSumTriplet(int[] a, int target){
        int n = a.length;
        int result = 0;

        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int k=j+1; k<n; k++){
                    if(a[i]+a[j]+a[k] == target)
                        result++;
                }
            }
        }

        return result;

    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = scan.nextInt();
        int[] a = new int[n];

        System.out.println("Enter "+ n +" elements: ");
        for(int i=0; i<n; i++){
            a[i] = scan.nextInt();
        }

        System.out.println("Enter the target element: ");
        int target = scan.nextInt();
        scan.close();

        System.out.println(TargetSumTriplet(a, target));     
    }
}
