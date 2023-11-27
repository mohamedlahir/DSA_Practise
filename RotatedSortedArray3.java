public class RotatedSortedArray3 {
    public static int search(int nums[],int target){
        int start=0;
        int end = nums.length-1;
        while(start<=end){
            int middle = start+(end-start)/2;
            if(nums[middle]==target){
                return middle;
            } else if (nums[start]<=nums[middle]) {
                if(target>=nums[start]&&target<nums[middle]){
                    end =middle-1;
                }else {
                    start= middle+1;
                }
            }else {
                if(target>nums[middle]&&target<=nums[end]){
                    start =middle+1;
                }else {
                    end = middle-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums ={3,1};
        int target = 1;
        System.out.println(search(nums,target));
    }
}
