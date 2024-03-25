package Recursion;

public class TowerofHanoi {
    /* ***
     * Tower Of Hanoi: 3 towers (A = Source, B = Helper, C = destination), 'n' disks should be transferred from A to C with the help of B and following rules.
     * Tower Of Hanoi Rules:
     * 1. Only one disk transferred in 1 step
     * 2. Smaller disks are always kept on top of larger disks.
     * ***
     * If n=1, disk can be transferred from source to destination
     * If n=2, smaller disk transferred to B and larger disk to C and then transfer smaller disk from B to C.
     * If n=3, 3-->C, 2-->B, 3-->B, 1-->C, 3-->A, 2-->C, 3-->C. 
     */
    public static void towerOfHanoi(int n, String src, String helper, String dest){
        if(n == 1){
            System.out.println("transfer disk "+ n +" from "+src+" to "+ dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("transfer disk "+ n +" from "+src+" to "+ dest);
        towerOfHanoi(n-1, helper, src, dest);
    }
    
    public static void main(String[] args){
        int n = 5;
        towerOfHanoi(n, "S", "H", "D");
        // Time Complexity: O(2^n-1) ~ O(2^n)
     }   
}
