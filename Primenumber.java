class Primenumber {

    static boolean checkPrime(int n){
   

        if (n<=1){
            return  false;
        }
        for (int i = 2; i*i <=n; i++) {
            if(n%i==0){
                return false; 
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int num = 11;
        if(checkPrime(num)){
            System.out.println("it is prime number");
        } else {
            System.out.println("it not prime number");
        }
    }
}