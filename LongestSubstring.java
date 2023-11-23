public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int lengthOfTheString = s.length();
        String arr[] = s.split("");
        for (int i = 0; i < arr.length-1; i++) {
            int count =0;
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[i]==arr[j]){
                    count++;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String string = "abcabcbb";
        LongestSubstring obj= new LongestSubstring();
        System.out.println(obj.lengthOfLongestSubstring(string));
    }
}
