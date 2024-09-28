package Recursion;
//Print nos. 5 to 1

public class R_q1 {

    static int Numbers(int n){
        if (n<=0){
            return 0;
        }
        System.out.println(n);
        return Numbers(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        Numbers(n);
    }
}
