public class BinarySearch6 {

    int bSearch(int[] nums,int target){

        int start=0;
        int end = nums.length-1;
        while(start<=end){

            int middle = start+(end-start)/2;                // int[]nums ={0,1,2,3,4,5,6,7,8,9};
            if(nums[middle]==target){
                return middle;
            } else if (nums[middle]<target) {
                start =middle+1;
            }else {
                end =middle-1;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        int[]nums ={-1,0,1,2,3,4,5,6,7,8,9};
        int target =90;
        BinarySearch6 obj = new BinarySearch6();
        System.out.println(obj.bSearch(nums,target));
    }
}
