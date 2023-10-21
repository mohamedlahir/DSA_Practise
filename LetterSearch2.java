public class LetterSearch2 {
    public char hello(char letters[], char target) {
        int start = 0;
        int end = letters.length;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] > target) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
    public static void main(String[] args) {
        char letters[] = {'c', 'd', 'f'};
        char target = 'a';
        LetterSearch2 obj = new LetterSearch2();
        System.out.println(obj.hello(letters, target));

    }
}
