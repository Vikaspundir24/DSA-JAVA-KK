public class searchInRange {
    public static void main(String[] args) {
        int [] arr = {1,3,55,23,12,456};
        System.out.println(searchInRange(arr,1,4,23));
    }
    static boolean searchInRange(int [] arr, int start, int end,int target){
        if(arr.length !=0){
            for(int i=start;i < end; i++){
                if(arr[i] == target){
                    return true;
                }
            }
            return false;
        }
        return false;

    }
}
