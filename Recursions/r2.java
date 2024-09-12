package Recursions;

public class r2 {
    static int factorial(int n){
       if(n==0) return 1;
        n*=factorial(n-1);
        return n;

    }
    public static void main(String[] args) {
        System.out.println(factorial(1));
    }
}
