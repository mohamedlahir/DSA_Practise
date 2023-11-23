import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

//import java.lang.reflect.Array;
//import java.util.Arrays;
public class LongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        String array[] = s.split("");
        List<String> list = Arrays.asList(array);
        for (int i = 0, k = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    list.remove(j);
                }
            }
        }
        return list.size();
    }

    public static void main(String[] args) {
        String string = "pwwkew";
        LongestSubstring obj = new LongestSubstring();
        System.out.println(obj.lengthOfLongestSubstring(string));
    }
}
