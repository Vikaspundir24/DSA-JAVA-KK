public class orderAgnosticBS {
    public static void main(String[] args) {
        int [] arr = {1,2,4,5,8,12,13,15,20,34,37};
        int target = 2;
        int ans = ogbs(arr,target);
        System.out.println(ans);
    }

     static int ogbs(int[] arr, int target)
     {
         int start = 0;
         int end = arr.length - 1;

         boolean isAsc = arr[start] < arr[end];

         while(start <= end)
         {
             int mid = start + (end - start)/2;

             if(arr[mid] == target){
                 return mid;
             }
             if(isAsc){
                 if(target<arr[mid]){
                     end = mid - 1;

                 }
                 else {
                     start = mid +1 ;
                 }
             }
             else {
                 if (target<arr[mid]){
                     start = mid + 1;
                 }
                 else {
                     end = mid -1;
                 }
             }
         }
         return -1;
     }

}
