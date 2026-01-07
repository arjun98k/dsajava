public class Armstrong {

    int armStrongnum(int n){
        int temp = n, sum=0 ,count=0;
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }

       temp =n; int r;

       while (temp > 0) {
        r = temp %10;
        sum+=(Math.pow(r, count));
        temp = temp/10;
       }
       return sum;
    }
    public static void main(String[] args) {
        Armstrong obj = new Armstrong();
          int checkarmnum  = 154;
        int result = obj.armStrongnum(checkarmnum);
      
        if (result == checkarmnum) {
            System.out.println("it is armstrong number");
        } else {
            System.out.println("it is not armstrong number");
        }
     
    }
}
