
import java.util.Scanner;

public class TotalString {
     static int totalString(String str){
       int count=-0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                count++;
            } 
        }
        return  count;
     }
    
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the string ");
        String input = obj.nextLine();
        System.out.println(totalString(input));
    }
}
