
import java.util.Scanner;

public class SumNatural {

    int naturalSum(int n) {
        return n =n*(n +1)/2;
    }
    // find using while loop

    int naturalSum2(int n){
       int i =1, sum =0;
        while (i <= n) {
               sum+=i;
             i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to find natural number");
        int input = sc.nextInt();
        SumNatural obj = new SumNatural();
        // int result = obj.naturalSum(input);
        // System.out.println(result);
        int result2 = obj.naturalSum2(input);
        System.out.println(result2);
    }
}