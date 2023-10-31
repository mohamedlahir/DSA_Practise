public class BinarySearch4 {

    public int binarySearchMethod(int nums[],int target){
        int start=0;
        int end = nums.length-1;
        while(start<=end){
            int middle = start+(end-start)/2;
            if(nums[middle]>target){
                System.out.println("Left Search");
                end =middle-1;
            } else if(nums[middle]==target) {
                System.out.println("Answer found");
                return middle;
            }else {
                System.out.println("Right Search");
                start = middle+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums ={-1,0,1,2,3,4,5,6,7,8,9,10};
        System.out.println(nums.length-1);
        int target = -100;
        BinarySearch4 obj = new BinarySearch4();
        System.out.println(obj.binarySearchMethod(nums,target));
    }
}
