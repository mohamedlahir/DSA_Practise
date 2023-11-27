import java.util.Arrays;

public class SingleElementiii {
    public static int[] answer(int[] nums){
        int[] ans = new int[2];
        int count = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            count =0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i]==nums[j]){
                    count++;
                }
            }
            if (count==1){
                ans[index]=nums[i];
                index++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums={1,2,1,3,2,5};
        System.out.println(Arrays.toString(answer(nums)));
    }
}