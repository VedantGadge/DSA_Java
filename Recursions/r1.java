package Recursions;

public class r1 {
    static void getCounts(int n){
        if(n==0) return;
        System.out.println(n);
        getCounts(n-1);
    }
    public static void main(String[] args) {
        getCounts(10);
    }
}
