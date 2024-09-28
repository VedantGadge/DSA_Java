package Recursion;
//Print sum of first n natural nos.
public class R_q2 {
    static int  R_Sum(int n, int s){
        if(n==0) return s;      
        return s += R_Sum( n--, s);
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(R_Sum(n,0));
    }
}
