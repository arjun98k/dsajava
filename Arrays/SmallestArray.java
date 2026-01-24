public class SmallestArray {
    public static int smallestFind(int arr[]){
     int smallnum = arr[0];
     for (int i : arr) {
         if (i < smallnum) {
            smallnum = i;
         }

     }
      return  smallnum;
    }
    public static void main(String[] args) {
         int[] arr = {10, 5, 20, 8};
         int result = smallestFind(arr);
         System.out.println(result);
    }
}
