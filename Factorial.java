

public class Factorial {
    int fact(int factnum) {
     int  result=1;
        while ( factnum > 0) {
            result = result*factnum;
            factnum--;
        }
        return result;

    }

    public static void main(String[] args) {
        Factorial obj = new Factorial();
        int result = obj.fact(5);
        System.out.println(result);
    }
}
