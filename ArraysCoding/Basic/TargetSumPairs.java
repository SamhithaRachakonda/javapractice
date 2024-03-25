package ArraysCoding.Basic;
import java.util.Scanner;

class ArraysCoding{
    static int TargetSumPair(int[] a, int target){
        int n = a.length;
        int result = 0;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(a[i]+a[j] == target)
                    result++;
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

        System.out.println(TargetSumPair(a, target));     
    }
}