public class RotatedSortedArray {

    static int search(int nums[], int target) {

        int start = 0;
        int end = nums.length-1;
        while (start <= end) {
            int middle = start + (end - start) / 2;    //4,5,6,7,0,1,2
            if (target == nums[middle]) {
                return middle;
            } else if (nums[start] <= nums[middle]) {
                if (target >= nums[start] && target < nums[middle]) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            } else {                                   //6,7,0,1,2,4,5
                if (target > nums[middle] && target <= nums[end]) {
                    start = middle + 1;
                } else {
                    end = middle - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//int nums[] ={4,5,6,7,0,1,2};
        int target = 0;
        int[] nums = {3, 1};
        System.out.println(search(nums, target));
    }
}
