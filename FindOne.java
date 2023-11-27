import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/single-number/
public class FindOne {
    public List<Integer> singleNumber(int nums[]) {

        List<Integer> ans = new ArrayList<>();
        int count;
        int indexList = 0;
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count == 1) {
                ans.add(nums[i]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = {2, 2, 1, 0, 3, 4, 5, 6, 7, 8, 9};
        FindOne obj = new FindOne();
        System.out.println(obj.singleNumber(nums));
    }
}
