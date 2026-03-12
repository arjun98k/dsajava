
import java.util.Scanner;

public class ArrmStrongg {
    static int armStrong(int numb){
        int temp , sum = 0 , last = 0 , digit=0;
        temp = numb;
        while (temp > 0) {
            temp = temp/10;
            digit++;
        }
        temp = numb;
        while (temp >0) {
            last = temp%10;
            sum+=Math.pow(last, digit);
            temp=temp/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner obj = new Scanner(System.in);
        int result = obj.nextInt();
        if (armStrong( result) == result) {
            System.out.println("it is armstrong number " + result);
        } else  {
            System.out.println("it is not armstrong number " + result);
        }
    }
}
