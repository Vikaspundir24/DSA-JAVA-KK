public class linearSearch {
    public static void main(String[] args) {
        // search in the array: return the index if item found otherwise return -1;
        int [] nums= {1,2,4,6,211,344,532,12};
        int indexNumber = linearSearch(nums,0);
        System.out.println(indexNumber);


    }
    static int linearSearch(int [] arr, int target){
        if(arr == null){
            return -1;
        }
        for (int index=0 ; index< arr.length; index++){
            if (arr[index] == target) return index;
        }
        return -1; //
    }
}
