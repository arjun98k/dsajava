
import java.util.Scanner;

public class SumNaturalNumber {
    static int sumNatural(int num){
        int result = num*(num+1/2);
        return  result;
    }
    public static void main(String[] args) {
        System.out.println("enter the number ");
        Scanner obj = new  Scanner(System.in);
        int result = obj.nextInt();
        
        System.out.println(sumNatural(result));
        
    }
}
