
class Fibo {

    static int fibonacci(int total){
        int n1=0,n2=1 ,n3;
          System.out.print(n1 + "  " + n2);
        for(int i=2 ;  i< total ;i++){
            n3 = n1 +n2;
         System.out.print(" "+ n3);
           n1 = n2;
           n2 = n3;
           
        }
       
        return total;
    }

    public static void main(String[] args) {
     Fibo.fibonacci(9);
    

    }
}