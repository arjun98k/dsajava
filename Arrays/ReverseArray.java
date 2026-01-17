

public class ReverseArray {
   int[] reverseArr(int arr[]){
    for (int i = 0; i < arr.length/2; i++) {
        int pos = arr[i];
        arr[i] = arr[arr.length-1-i];
        arr[arr.length-1-i] = pos;
    }
       return arr;
   }
    public static void main(String[] args) {
        ReverseArray obj = new ReverseArray();
        int inputarr[] = {11,12,14,15};
        int resultarr [] = obj.reverseArr(inputarr);
        for (int i : resultarr) {
            System.out.print(i + " ");
        }
    }
}
