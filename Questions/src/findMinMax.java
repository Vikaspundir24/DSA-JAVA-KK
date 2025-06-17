public class findMinMax {
    public static void main(String[] args) {
        int [] nums= {1,2,4,6,211,344,532,12};
        int min = findMin(nums);
        int max = findMax(nums);
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
    static int findMin(int[] arr){
        if (arr.length == 1){
            return arr[0];
        }
        int min = arr[0];
        for(int i = 0; i<arr.length; i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    static int findMax(int[] arr){
        if (arr.length == 1){
            return arr[0];
        }
        int max = arr[0];
        for(int i = 0; i<arr.length; i++){
            if (arr[i]> max){
                max = arr[i];
            }
        }
        return max;
    }
}
