import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://leetcode.com/problems/binary-search/submissions/
public class BinarySearch {

    int nums1[];
    int nums[] = {-2,-1,1, 2, 3, 4, 5, 6, 7, 8, 9,10,11,15};
     public int[] addNumber(){
        int million = 100000;
        List<Integer> a = new ArrayList<>();
        int arr[]= new int[million];
        for (int i = 0; i < million; i++) {
            a.add(i);
        }
        for (int i = 0; i < million; i++) {
            arr[i]= a.get(i);
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
    private int bSearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        //Formula for finding the middle element
        int mid = start + (end - start) / 2;
        System.out.println("Middle value : "+mid +" Middle array value : "+nums[mid]);
        while(start<=end){
            if (nums[mid]<target){
                start = mid+1;
                System.out.println("Right");
            } else if (nums[mid] == target) {
                System.out.println("Found the answer in : ");
                return mid;
            }else {
                System.out.println("Left");
                end = mid-1;
            }
            mid = start + (end - start) / 2;
        }
        return -1;
    }
    public static void main(String[] args) {
        int target = 50000;
        BinarySearch search = new BinarySearch();
        search.nums1=search.addNumber();
        System.out.println(search.bSearch(search.nums1, target));
    }
}



