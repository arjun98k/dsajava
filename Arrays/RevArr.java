public class RevArr {
    int[] ReverseArray( int arr[]){
    int start = 0 ; int end = arr.length-1; int temp;
    while (start < end) {
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
       

    }
    return arr;


    }
    public static void main(String[] args) {
          int arr[] = { 12, 23, 45, 89, 22, 8, 36, 25 };  
          RevArr obj = new RevArr();
          int[] result = obj.ReverseArray(arr);
          for (int i : result) {
              System.out.print(" " + i );
          }
    }
}
