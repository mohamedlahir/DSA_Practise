//https://leetcode.com/problems/single-number-ii/
public class SingleElementii {
    public static int answer(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count =0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i]==nums[j]){
                    count++;
                }
            }
            if(count==1){
                return nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int nums[] = {2,2,3,2};
        System.out.println(answer(nums));

    }
}
