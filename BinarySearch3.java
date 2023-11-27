public class BinarySearch3 {


    public boolean findSort(int nums[]) {
        int start = 0;
        int end = nums.length - 1;
        boolean isAscending = false;
        if (nums[start] < nums[end]) {
            isAscending = true;
        }
        return isAscending;
    }

    public int decBinarySearch(int nums[], int target) {

        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {                            //int nums[] = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public int ascBinarySearch(int nums[], int target) {

        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return-1;
}
    public static void main(String[] args) {

//      Sorted in decending order
//      int nums[] = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
//      Sorted in Ascending Order
        int nums[] = {0,1,2,3,4,5,6,7,8,9,10};
        int target = 0;
        BinarySearch3 obj = new BinarySearch3();
        System.out.println(obj.findSort(nums));
        if (obj.findSort(nums)) {
            System.out.println(obj.ascBinarySearch(nums,target));
        } else {
            System.out.println(obj.decBinarySearch(nums, target));
        }
    }
}
