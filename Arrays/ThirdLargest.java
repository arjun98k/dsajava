public class ThirdLargest {
  public static int thirdLargest(int arr[]){
    if (arr.length < 2) {
        throw new IllegalArgumentException("Array must have at least 2 elements");

    }
    int largest= Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;
    int thirdLargest = Integer.MIN_VALUE;
    
    for (int currentnum : arr) {
        if (currentnum > largest) {
            secondLargest = thirdLargest;
            thirdLargest = currentnum;
        } else if (currentnum > secondLargest && currentnum != largest) {
            thirdLargest = secondLargest;
            secondLargest = currentnum;
        }else if (currentnum > thirdLargest && currentnum!=thirdLargest && currentnum!=secondLargest) {
            thirdLargest = currentnum;
        }
    }
    return thirdLargest;
  }

    public static void main(String[] args) {
           int[] arr = {10, 5, 20, 8};
        int result = thirdLargest(arr);
        System.out.println("the third largest number is "+ result);
    }
}
