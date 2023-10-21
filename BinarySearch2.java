import java.util.Arrays;

public class BinarySearch2 {
    int arr[] = {1,2,3,4,5,6,7};
    public  int binarysearch(int nums[], int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid]<target) {
                System.out.println("Right Search");
                start = mid+1;
            } else if (nums[mid]==target) {
                return nums[mid];
            }else {
                System.out.println("Left Search");
                end = mid-1;
            }
        }
        return -1;
    }
    public int[] addElement(){
        int million= 1000000;
        int arr[] = new int [million];
        for (int i = 0; i < million; i++) {
            arr[i] = i;
        }
        return arr;
    }
    public static void main(String[] args) {
        BinarySearch2 obj = new BinarySearch2();
        int target =999999;
        int nums[]=obj.addElement();
        System.out.println(Arrays.toString(nums));
        System.out.println(obj.binarysearch(nums,target));
    }
}
