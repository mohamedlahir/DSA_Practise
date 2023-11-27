public class BinarySearch5 {

    static int bSearch(int nums[], int target){
        int start=0;
        int end = nums.length-1;
        while(start<=end){
            int middle = start+(end-start)/2;
            if(nums[middle]==target){
                return middle;
            } else if (nums[middle]<target) {
                start = middle+1;
            }else {
                end =middle-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums ={-1,0,1,2,3,4,4,6,7,7,78};
        int target =78;
        System.out.println(bSearch(nums,target));
    }
}
