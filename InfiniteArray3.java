import java.util.Arrays;

public class InfiniteArray3 {

    int findStartAndEnd(int target,int nums[]){
        int start =0;
        int end = 1;
        while(target>end){
            int newStart =end+1;
            end = end*2;
            if (end> nums.length)
            {
                end= nums.length;
            }
        }
        return binarySearch(target,nums,start,end);
    }

    int binarySearch(int target, int nums[],int start, int end){
        while(start<end){
            int middle = start+(end-start)/2;
            if(nums[middle]==target){
                return middle;
            } else if (nums[middle]>target) {
            end = middle-1;
            }else {
                start= middle+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
int million = 1000000;
        int nums[] = new int[million];
        for (int i = 0; i < million; i++) {
            nums[i]=i;
        }
        System.out.println(Arrays.toString(nums));
        InfiniteArray3 obj = new InfiniteArray3();
        System.out.println(obj.findStartAndEnd(million,nums));
    }
}
