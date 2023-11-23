public class RotatedBinarySearch {
    public int findPivot(int nums[]) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid + 1]) {
                return nums[mid];
            }
            if (nums[mid - 1]< nums[mid]) {
                return nums[mid-1];
            }
            if (nums[start] <= nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {7, 8, 9, 10, 0, 1, 2, 3, 4, 5};
        RotatedBinarySearch obj = new RotatedBinarySearch();
        System.out.println(obj.findPivot(nums));
    }
}
