
import java.util.Scanner;



public class PrimeNumberr {

    static boolean  primeNumber(int num){
        if (num == 0 || num ==1) {
            return false;
        }
        for (int i = 2; i*i < num; i++){
            if (num%i == 0) {
               return  false;
            } 
            
        } return true;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the number you want to ");
        int input = obj.nextInt();
        if (primeNumber(input) ) {
             System.out.println("it is prime number");
        } else {
            System.out.println("it not prime number");
        }
    }
        }
        
        
    

