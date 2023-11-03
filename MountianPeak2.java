public class MountianPeak2 {

    public int search(int nums[]) {

        int start = 0;
        int end = nums.length;

        while (start < end) {
            int middle = start + (end - start) / 2;
            if (nums[middle] > nums[middle]) {
                end = middle;
            } else {
                start = middle + 1;
            }
            return start;
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 3, 2, 1};
        MountianPeak2 obj = new MountianPeak2();
        System.out.println(obj.search(nums));
    }
}
