import java.util.Arrays;

public class BubbleSort {

    public static int[] sort(int[] nums) {
        int temp ;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0 + 1; j < nums.length; j++) {

                if (nums[i] > nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;

                }

            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int nums[] = {9, 2, 3, 6, 7, 4, 6, 3, 8};
        System.out.println(Arrays.toString( sort(nums)));
    }
}
