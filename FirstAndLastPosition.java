import java.util.Arrays;

public class FirstAndLastPosition {
    public int search(int nums[], int target, boolean startPosition) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                ans = mid;
                if (startPosition) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
    public int[] searchRange(int nums[], int target) {
        int[] ans = {-1, -1};
        ans[0] = search(nums, target, true);
        ans[1] = search(nums, target, false);
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2,2};
        int target = 2;
        FirstAndLastPosition obj = new FirstAndLastPosition();
        System.out.println(Arrays.toString(obj.searchRange(nums, target)));
    }
}