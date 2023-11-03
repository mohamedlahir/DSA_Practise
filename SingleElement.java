//https://leetcode.com/problems/single-element-in-a-sorted-array/

public class SingleElement {
    public static int searchSingleElement(int nums[]) {
        int count;
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }

            } if (count==1){
                return nums[i];
            }
        }
        return -1;
       /* int x = 0;
        for (int a : nums) {
            x = x ^ a;
        }
        return x;*/
    }
    public static void main(String[] args) {
        int nums[] = {3,7,7,10,10,11,11,12,12};
        System.out.println(searchSingleElement(nums));
    }
}
