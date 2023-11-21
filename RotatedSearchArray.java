public class RotatedSearchArray {

    public static int bSearch(int nums[], int target) {
        int start = 0;
        int end = nums.length - 1;
        int middle = start + (end - start) / 2;                      //int nums[] = {7, 8, 1, 2, 3, 4, 5, 6};
        if (target == nums[middle]) {
            return middle;
        }
        if (target >nums[start] && target <= nums[middle - 1]){
            end = middle-1;
        }if (target>=nums[end]&&target<nums[middle+1]){
            start = middle+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {7, 8, 1, 2, 3, 4, 5, 6};
        int target = 6;
        RotatedSearchArray obj = new RotatedSearchArray();
        System.out.println(obj.bSearch(nums, target));
    }
}
