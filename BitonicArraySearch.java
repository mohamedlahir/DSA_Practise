public class BitonicArraySearch {
    static int bSearch(int[]nums){
        int start =0;
        int end = nums.length-1;
         while(start<=end){
            int mid = start+(end-start)/2;                                  //1,2,3,4,5,3,2,1
            // The middle r
             if(nums[mid]>nums[mid+1]){
                end =mid+1;
            }else{
                 start =mid+1;
             }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums ={1,2,3,4,5,3,2,1};
        System.out.println(bSearch(nums));
    }

}
