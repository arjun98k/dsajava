public class SecondLargest {

    // While traversing the array:

// If current number > largest
// → secondLargest = largest
// → largest = current number

// Else if current number > secondLargest AND current number != largest
// → secondLargest = current number

    public int secondlargest(int []arr){
        if (arr.length <2) {
            throw new IllegalArgumentException("Array must have at least 2 elements");
        }
        int largest= Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int currentnum = 0; currentnum < arr.length; currentnum++) {
            if (arr[currentnum] > largest ) {
               secondLargest = largest;
                largest = arr[currentnum];
            }
            else if (arr[currentnum] > secondLargest && arr[currentnum]!=largest) {
                secondLargest= arr[currentnum];
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8};

        SecondLargest obj = new SecondLargest();
        int result = obj.secondlargest(arr);
        System.out.println("Second Largest = " + result);
    }
}


