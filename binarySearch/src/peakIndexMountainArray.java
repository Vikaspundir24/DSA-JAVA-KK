public class peakIndexMountainArray {
    public static void main(String[] args) {
        int arr [] = {0,2,4,7,4,1,};
        int left = 0;
        int right = arr.length - 1;
        while(left !=right){
            int mid = left + (right - left)/2;
            if(arr[mid] >= arr[mid+1])
            {
                right = mid;
            }
            else {
                left = mid+1;
            }


        }

        System.out.println(left);

    }
}
