class PalindromeNumber {
   int findPalindromeNumber(int n){
    int r,sum = 0;
    int temp; 
       temp = n;
       while(n>0){
        r = n%10;
        sum =(sum *10)+r;
        n= n/10;

       }
       return  sum;
   }

    public static void main(String[] args) {
        PalindromeNumber obj = new PalindromeNumber();
        int number = 101;
        int reverse = obj.findPalindromeNumber(number);
        if(number == reverse) {
            System.out.println("number is palindrome");
        } else{
            System.out.println("number is not palindrome");
        }
        
    }
}