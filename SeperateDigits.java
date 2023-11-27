//https://leetcode.com/problems/separate-the-digits-in-an-array/
public class SeperateDigits {
    public static int[] seperate(int[] nums) {
        int temp =0;
        int divide =0;
        for (int i = 0; i < nums.length; i++) {
            temp = nums[i];
            divide = temp%10;

        }
        return new int[9];
    }

    public static void main(String[] args) {
        int[] nums = {13, 25, 83, 77};
        seperate(nums);
    }
}
