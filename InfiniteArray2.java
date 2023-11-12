import java.util.Arrays;

public class InfiniteArray2 {

    int findTheStartAndEnd(int nums[], int target) {
        int start = 0;
        int end = 1;
        int newStart=0;
        while (target>end) {
            newStart = end+1;
            end = end*2;
            if ( end>nums.length){
                end= nums.length-1;
            }
            start = newStart;
        }
        System.out.println("new start : "+newStart);
        System.out.println("End : "+end);
        return binarySearch(nums, target, start, end);
    }

    int binarySearch(int nums[], int target, int start, int end) {
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (nums[middle] == target) {
                System.out.println("The target is in index of : "+middle);
                return middle;
            } else if (nums[middle] < target) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int million = 1000000;
        int arr[] = new int[million];
        for (int i = 0; i < million; i++) {
            arr[i]=i;
        }
        int target = 999999;
        InfiniteArray2 obj = new InfiniteArray2();
        System.out.println(Arrays.toString(arr));
        System.out.println(obj.findTheStartAndEnd(arr, target));
    }

}
