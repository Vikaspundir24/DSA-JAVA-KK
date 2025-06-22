public class ceilingOfNumber {
    public static void main(String[] args) {
        //cieling  =  smalled element in the array greater or = target
        int [] arr = {2,3,4,6,8,9,12,23,54};
        int target = 15;
        int ans = ceil(arr, target);
        System.out.println(ans);
    }
    static int ceil(int[] arr, int target){
        int start =0;
        int end = arr.length-1;

        while (start <= end)
        {
            int mid = start + (end - start)/2;
            if(target > arr[mid]){
                start = mid+1;
            } else if (target< arr[mid]) {
                end = mid - 1;
            }
        }

        return arr[start];
    }
}
