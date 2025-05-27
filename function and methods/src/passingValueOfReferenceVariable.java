import java.util.Arrays;

public class passingValueOfReferenceVariable {
    public static void main(String[] args) {
        // create an array
        int[] arr = {1,3,2,45,6};
        change(arr); //arr ref is actually passed by call by value ..the value which is passsed refers to the arr object
        System.out.println(Arrays.toString(arr));

    }

    static void change (int [] nums)
    {
        nums[0] = 99; // if you make a change to the object via the ref variable, same will be changed.
    }
}
// in java we do not have pointers or do not get addresses here..unlike C lang
