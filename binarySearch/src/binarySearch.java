public class binarySearch {
    public static void main(String[] args)
    {
        int [] arr = {1,2,4,5,8,12,13,15,20,34,37};
        int target = 13;
        System.out.println(bSearch(arr,target));
    }

    //return the index
    // return -1 if it doest not exist
    static int bSearch(int [] arr, int target){
        int start =0;
        int end = arr.length -1 ;
        while(start <= end){
            //find the middle element
            //int mid = (start + end)/2;  //might be possible that (s + e) it excedees the range of integer
            int mid = start + (end - start)/2;
            if(target> arr[mid]){
                start = mid +1;
            }
            else if(target<arr[mid]){
                end = mid -1;
            }
            else {
                return mid;
            }

        }
        return  -1;

    }
}
