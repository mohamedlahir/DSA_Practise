public class FindDuplicate {
    public static boolean find(int[] nums) {
        int count=0;
        boolean isDuplicatePresent;
        for (int i=0;i<nums.length;i++) {
            count = 0;
            for (int j = 0; j < nums.length;j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if(count > 1) {
               return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(find(nums));
    }

}
