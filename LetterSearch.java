public class LetterSearch {
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/

    public char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length;

        while (start < end) {
            int middle = start + (end - start) / 2;
            if (target < letters[middle])
                end = middle;
            else
                start = middle + 1;
        }
        return letters[start % letters.length];
    }

    public static void main(String[] args) {
        char target = 'c';
        char letters[] = {'c', 'f', 'j'};
        LetterSearch obj = new LetterSearch();
        System.out.println(obj.nextGreatestLetter(letters, target));
    }
}
