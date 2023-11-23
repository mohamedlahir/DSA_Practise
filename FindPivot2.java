public class FindPivot2 {

    public int findThePivot2(int nums[]) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            //First condition
            if (nums[mid]>nums[mid+1]){
                return nums[mid];
            }
            if(nums[mid]<nums[mid-1]){
                return nums[mid-1];
            }
            if (nums[mid]<=nums[start]){
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {4,5,6,7,8,0,1,2,3};
        FindPivot2 obj = new FindPivot2();
        System.out.println(obj.findThePivot2(nums));
    }
}

