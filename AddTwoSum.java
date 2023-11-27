import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AddTwoSum {

    public int[] twoSum(int num[], int target) {
        Map<Integer, Integer> map = new HashMap<>();
        System.out.println("Hash Map initialized"+map);
        for (int i = 0; i < num.length; i++) {
            if (map.containsKey(target - num[i])) {
                return new int[]{map.get(target - num[i]), i};
            } else {
                map.put(num[i], i);
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int num[] = {2,3,7,11,14,15};
        int target = 17;
        AddTwoSum obj = new AddTwoSum();
        System.out.println(Arrays.toString(obj.twoSum(num, target)));
    }
}