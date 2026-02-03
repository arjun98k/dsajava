public class FreqArray {

  public   static  void findFrequency(int  [] arr){

        boolean [] visted = new boolean[arr.length];
       for (int i = 0; i < arr.length; i++) {
        if (visted[i]) {
          continue;
        }
        int count = 1;

        for (int j = i+1; j < arr.length; j++) {
            if (arr[i] == arr[j]) {
              count++;
              visted[j] = true;
            }
        }
        System.out.println("array frequency occur " + arr[i] + "  " + count );
           
       }

    
    }

    public static void main(String[] args) {
      
        int[] arr = {10, 20, 10, 30, 20, 10};
        findFrequency(arr);
        
    }
}
