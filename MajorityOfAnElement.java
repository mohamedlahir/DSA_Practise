import java.util.LinkedList;

//https://leetcode.com/problems/majority-element/
public class MajorityOfAnElement {
    public int findMajority(int nums[]) {
        int ans = 0;
        int length = nums.length;
        int n = (length / 3);
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                    if (count > n) {
                        ans = nums[i];
                        return ans;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2};
        MajorityOfAnElement obj = new MajorityOfAnElement();
        System.out.println(obj.findMajority(nums));
    }
}