public class floorOfaNumber {
    public static void main(String[] args) {
        //cieling  =  smalled element in the array greater or = target
        int [] arr = {2,3,5,9,14,16,18};
        int target = 15;
        int ans = floor(arr, target);
        System.out.println(ans);
    }
    static int floor(int[] arr, int target){
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
            else{
                return mid; //ans found
            }
        }

        return end;
    }

}

