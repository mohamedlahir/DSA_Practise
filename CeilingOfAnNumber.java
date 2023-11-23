public class CeilingOfAnNumber {

    public static int ceil(int nums[], int target) {

        int start = 0;
        int end = nums.length - 1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if (nums[mid]==target){
                return nums[mid];
            }
            if (nums[mid]<target){
                start = mid +1;
            }else {
                end = mid -1;
            }
        }
        return nums[start];
    }
    public static void main(String[] args) {
        int nums[] = {2, 4, 5, 9, 14, 16, 18};
        int target = 4;
        System.out.println(ceil(nums, target));
    }
}