import java.util.*;

public class trycatch {
    /*
     * Input Format
The first line has an integer . In each of the next  lines there will be an integer  denoting number of integers on that line and then there will be  space-separated integers. In the next line there will be an integer  denoting number of queries. Each query will consist of two integers  and .

Constraints

Each number will fit in signed integer.
Total number of integers in  lines will not cross .

Output Format
In each line, output the number located in  position of  line. If there is no such position, just print "ERROR!"

Sample Input

5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5
Sample Output

74
52
37
ERROR!
ERROR!
     */
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<ArrayList<Integer>> pos = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            int d = scan.nextInt();
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0; j<d; j++){
                temp.add(scan.nextInt());    
            }
            pos.add(temp);
        }
        
        int q = scan.nextInt();
        
        while(q-- != 0){
            int x = scan.nextInt();
            int y = scan.nextInt();
            try {
                System.out.println(pos.get(x-1).get(y-1));
            }catch (IndexOutOfBoundsException e){
                System.out.println("ERROR!");
            }
        }
        scan.close();
    }
}