package Recursion;

public class printx_n {
    public static int Printx_n(int x, int n){
        if(n==0)
            return 1;
        else if(x==0)
            return 0;
        
        int prevvalue = Printx_n(x, n-1);
        int xn = x * prevvalue;
        return xn;
    }

    public static int Printx_n_logn(int x, int n){
        if(n==0)
            return 1;
        if(x==0)
            return 0;
        if(n%2 == 0){
            return Printx_n_logn(x, n/2) * Printx_n_logn(x, n/2);
        } else{
            return Printx_n_logn(x, n/2) * Printx_n_logn(x, n/2) * x;
        }
    }
    public static void main(String[] args){
        int x=2, n=5;

        System.out.print("Calculate x power n value (STACK HEIGHT = n): ");
        int xpowern = Printx_n(x, n);
        System.out.println(xpowern);

        System.out.print("Calculate x power n value (STACK HEIGHT = logn): ");
        int xpowern_logn = Printx_n_logn(x, n);
        System.out.println(xpowern_logn);
    }
}
