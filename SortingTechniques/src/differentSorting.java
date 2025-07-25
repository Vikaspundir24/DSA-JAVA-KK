import java.util.Arrays;

public class differentSorting {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void selectionSort(int [] arr){
       for (int i = 0; i< arr.length; i++){
           // find maxx item and swap with correct index

           int last = arr.length - i - 1;
           int maxIndex = getMaxindex(arr,0,last);

           swap(arr,maxIndex,last);
       }
    }

    static void swap (int[] arr, int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    private static int getMaxindex(int [] arr, int start, int end){
        int max = start;
        for(int i = 0; i<= end; i++){
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }





    static void bubbleSort(int[]arr){
        boolean swapped;
        // run the steps n-1 times
        for(int i = 0; i< arr.length; i++){
            swapped = false;
            //for each step, max item will come at the last respective index
            for (int j = 1; j< arr.length-i; j++){
                //swap if the item is smaller than the previous item

                if(arr[j] <  arr[j-1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }

            //if you did not swap for a particular value of i,
            // it means the array is sorted hence stop the program as it is already sorted

            if(!swapped){ // !false = true
                break;
            }

        }
    }
}
