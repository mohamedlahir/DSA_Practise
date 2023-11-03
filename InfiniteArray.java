public class InfiniteArray {

    public static int ans(int nums[],int target){
        int start=0;
        int end=1;
        while(target>end){
            int newStart = end+1;
            System.out.println(newStart);
            end = end+(end-start+1)*2;
            System.out.println(end);
            start = newStart;
        }
        return binarySearch(nums,target,start,end);
    }
    public static int binarySearch(int[] nums, int target,int start,int end) {
        while (start <= end) {
            int middle = start + (end - start) / 2;
//            System.out.println(middle);
            if (nums[middle] > target) {
                System.out.println("Left");
                end = middle - 1;
            } else if (nums[middle] == target) {
                System.out.println("Answer Found");
                return middle;
            } else {
                System.out.println("Right");
                start = middle + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7};
        int target =0;
        System.out.println(ans(nums,target));
    }
}
