import java.util.LinkedList;

//https://leetcode.com/problems/majority-element/
public class MajorityOfAnElement {
    public int findMajorityElement(int[] nums) {
        int ans = 0;
        int length = nums.length;

        int n = (length / 2);
//        System.out.println(n);
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
        int[] nums = {6,5,5};
        MajorityOfAnElement obj = new MajorityOfAnElement();
        System.out.println(obj.findMajorityElement(nums));
//        LinkedList<String> cars = new LinkedList<String>();
    }
}