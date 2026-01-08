import java.util.Scanner;

public class ReverseNumber {
    int revNum(int n){
        int remainder; int reverse=0;
      while (n >0) {
          remainder = n%10;
        reverse = reverse*10+remainder;
        n = n/10;
       
      }
      return  reverse;
    }
    public static void main(String[] args) {
         System.out.println("Enter the number you have to reverse number");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        ReverseNumber obj = new ReverseNumber();
        int result = obj.revNum(input);
        System.out.println("then number is reverse " + result);
        
    }
}
