
import java.util.Scanner;

class ReverseString {

     static String reverseString(String str){
        String reverse = "";

        for (int i= str.length() -1;i >=0 ; i--) {
           reverse = reverse + str.charAt(i);
        }
        return  reverse;
     }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter to reverse String");
       String input = sc.nextLine();
      System.out.println("reverse String " + reverseString(input));
      
    }
}