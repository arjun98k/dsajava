
import java.util.Scanner;

public class PrimeNumber {

    public static Boolean primeNumfind(int num){
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i*i <= num; i++) {
            if (num%i == 0) {
                return false;
            }
        } 
        return  true;
    }
    public static void main(String[] args) {
      System.out.println("enter check number ");
       Scanner sc = new Scanner(System.in);
       int number = sc.nextInt();
          if (primeNumfind(number)) {
            System.out.println("this is prime number " + number);
          } else {
            System.out.println("this not prime number "+ number );
          }
    }
}
