public class FindPivot {
    public int findThePivot(int nums[]) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return nums[mid];
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return nums[mid-1];
            }
            if (nums[mid]<=nums[start]){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int nums[] = {4,5,6,7,8,0,3};
//        int nums[] = {0,1,2,3,4,5,6,7};
        FindPivot obj = new FindPivot();
        System.out.println(obj.findThePivot(nums));
    }
}
