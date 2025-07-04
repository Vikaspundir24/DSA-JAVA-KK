public class smallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] arr = {'c','f','j'};
        char target = 'a';
        char ans =  nextGreatestLetter(arr,target);
        System.out.println(ans);
    }
    static char  nextGreatestLetter(char[] arr, char target){
        //but what if the target is greator than the greatest number in the aray

        int start =0;
        int end = arr.length-1;

        while (start <= end)
        {
            int mid = start + (end - start)/2;
            if (target< arr[mid]) {
                end = mid - 1;
            }
            else {
                start = mid+1;
            }

        }

        return arr[start % arr.length];
    }
}
