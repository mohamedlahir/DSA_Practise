import java.util.Arrays;

public class AddTwoSum {

    public int[] twoSum(int num[], int target) {
        int ans[] = {0,0};
        int count1=0;int count2=0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 1; j < num.length; j++) {
                if (num[i] + num[j] == target) {
                    ans[0]=i;
                    ans[1]=j;
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int num[] = {2, 7, 11, 15};
        int target = 26;
        AddTwoSum obj = new AddTwoSum();
        System.out.println(Arrays.toString(obj.twoSum(num,target)));
    }


}
