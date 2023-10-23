import java.util.Arrays;

public class FindIndex {

    public boolean isFound(){
        boolean isFounded = false;

        return isFounded;
    }

    public int findIt(int[] nums,int target){
    int ans[]={-1,-1};
    int start =0;
    int end = nums.length;;
    while (start<end){
        int middle = start + (end-start)/2;
        if (nums[middle]==target){
            return middle;
        }
        if (target<nums[middle]){
            System.out.println("Right Search");
            end = middle-1;
        }else {
            System.out.println("Left Search");
            start = middle +1;
        }
    }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,5,6,7,7,7,7,8};
        int target = 2;
        FindIndex obj = new FindIndex();
        System.out.println((obj.findIt(nums,target)));
    }
}
