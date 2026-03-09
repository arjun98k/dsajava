

public class Fibo {
    static int fiboNumber(int n){
        int n1=0, n2=1 , count = 0; 
        for (int i = 1; i < n; i++) {
            count = n1 +n2;
            n1 = n2;
            n2 = count;
        }
        return n2;
    }
    public static void main(String[] args) {
        System.out.println("the answer Fibonacci number");
        System.out.println(fiboNumber(10));
    }
}
