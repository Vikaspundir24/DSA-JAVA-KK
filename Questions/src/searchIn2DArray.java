import java.util.Arrays;

public class searchIn2DArray {
    public static void main(String[] args) {
        int [][] arr = {{1,2},
                {3,22,552,12},
                {334,11,313,445,22}};

        int target = 11;
        int[] ans = searchIn2DArray(target,arr); //     format of return value {row,col}
        System.out.println(Arrays.toString(ans));

    }
    static int[] searchIn2DArray(int target, int [][] arr){
        for (int row = 0; row< arr.length; row++){
            for (int col= 0; col< arr[row].length; col ++){
                if (arr[row][col] == target){
                    return new int[] {row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
