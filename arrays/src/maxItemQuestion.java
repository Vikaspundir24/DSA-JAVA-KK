public class maxItemQuestion {
    public static void main(String[] args) {
        int [] arr = {1,3,23,9,18};
        System.out.println(max(arr));

    }

    static int max(int [] arr){
        // if array is null then :

        if(arr == null) return -1;
       // if(arr.length < 1) return -1;
        int max = arr[0];
        for(int i = 1; i< arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
