import java.util.Arrays;

public class swapQuestion {
    public static void main(String[] args) {
        int [] arr = {1,3,23,9,18};
       // swap(arr,1,3);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap (int [] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] =  temp;

    }

    // REVERSING THE ARRAY
    static void reverse(int[] arr){
        int start = 0;
        int end  = arr.length - 1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
